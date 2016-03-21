package com.glodon.security.service;

import com.glodon.security.dao.UserDAO;
import com.glodon.security.domain.DBUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by zhangx-ae on 2016/3/3.
 * 一个自定义的service，用来和数据库进行操作，即以后我们要通过数据库保存权限，则需我们继承UserDetailsService
 */
public class CustomUserDetailsService implements UserDetailsService {

    private UserDAO userDAO = new UserDAO();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = null;
        try{
            DBUser dbUser = userDAO.getDatabase(username);
            user = new User(dbUser.getUsername(),dbUser.getPassword(),
                    true, true, true, true,
                    getAuthorities(dbUser.getAccess()));
        }catch (Exception e){
            throw new UsernameNotFoundException("Error in retrieving user");
        }
        return user;
    }

    public Collection<GrantedAuthority> getAuthorities(Integer access){
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>(2);

        authorityList.add(new GrantedAuthority(){
            @Override
            public String getAuthority() {
                return "ROLE_USER";
            }
        });
        if(access.compareTo(1) == 0){
            authorityList.add(new GrantedAuthority() {
                @Override
                public String getAuthority() {
                    return "ROLE_ADMIN";
                }
            });
        }
        return authorityList;
    }
}
