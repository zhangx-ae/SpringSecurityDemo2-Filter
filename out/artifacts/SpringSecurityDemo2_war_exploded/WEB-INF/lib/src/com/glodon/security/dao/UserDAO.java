package com.glodon.security.dao;


import com.glodon.security.domain.DBUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangx-ae on 2016/3/3.
 */
public class UserDAO {

    public DBUser getDatabase(String name){
        List<DBUser> users = internalDatabase();
        for(DBUser dbUser : users){
            if(dbUser.getUsername().equals(name)){
                return dbUser;
            }
        }
        return null;
    }

    //初始化数据
    private List<DBUser> internalDatabase(){
        List<DBUser> users = new ArrayList<DBUser>();
        DBUser dbUser = null;

        dbUser = new DBUser();
        dbUser.setUsername("admin");
        dbUser.setPassword("21232f297a57a5a743894a0e4a801fc3");// "admin"经过MD5加密后
        dbUser.setAccess(1);
        users.add(dbUser);

        dbUser = new DBUser();
        dbUser.setUsername("user");
        dbUser.setPassword("ee11cbb19052e40b07aac0ca060c23ee"); // "user"经过MD5加密后
        dbUser.setAccess(2);
        users.add(dbUser);

        return users;
    }
}
