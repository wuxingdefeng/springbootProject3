package com.jueke.mapper;

import com.jueke.entity.USERS;

import java.util.List;

public interface USERSMapper {
    int deleteByPrimaryKey(String userId);

    int insert(USERS record);

    int insertSelective(USERS record);

    USERS selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(USERS record);

    int updateByPrimaryKey(USERS record);

    List<USERS> selectAllUser();
}