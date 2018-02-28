package com.jueke.service.impl;

import com.github.pagehelper.PageHelper;
import com.jueke.entity.USERS;
import com.jueke.mapper.USERSMapper;
import com.jueke.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/2/28.
 */
@Service(value = "usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private USERSMapper usersMapper;
    @Override
    public int addUser(USERS users) {
        return usersMapper.insertSelective(users);
    }

    /*
   * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
   * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
   * pageNum 开始页数
   * pageSize 每页显示的数据条数
   * */
    @Override
    public List<USERS> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return usersMapper.selectAllUser();
    }

}
