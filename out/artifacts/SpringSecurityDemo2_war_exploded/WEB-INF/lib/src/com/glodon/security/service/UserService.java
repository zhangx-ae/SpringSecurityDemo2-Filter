package com.glodon.security.service;

import com.glodon.security.dao.MyUserMapper;
import com.glodon.security.model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.glodon.security.dao.UserDAO;

/**
 * Created by zhangx-ae on 2016/3/21.
 */
@Service
public class UserService {
    @Autowired
    private MyUserMapper myUserMapper;

    public MyUserMapper getMyUserMapper() {
        return myUserMapper;
    }

    public void setMyUserMapper(MyUserMapper myUserMapper) {
        this.myUserMapper = myUserMapper;
    }

    public MyUser getUserByName(String username){
        return myUserMapper.selectByPrimaryKey(username);
    }
}
