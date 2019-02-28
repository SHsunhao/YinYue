package com.qianfeng.dao;

import com.qianfeng.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface userMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findLogin(String name);
}