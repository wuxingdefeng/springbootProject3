package com.jueke.service;

import com.jueke.entity.USERS;

import java.util.List;

/**
 * Created by Administrator on 2018/2/28.
 */
public interface UsersService {
    int addUser(USERS users);

    List<USERS> findAllUser(int pageNum,int pageSize);
}
