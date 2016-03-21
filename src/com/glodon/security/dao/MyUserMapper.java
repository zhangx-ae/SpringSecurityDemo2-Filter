package com.glodon.security.dao;

import com.glodon.security.model.MyUser;

public interface MyUserMapper {
    int deleteByPrimaryKey(String username);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    MyUser selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(MyUser record);

    int updateByPrimaryKey(MyUser record);
}