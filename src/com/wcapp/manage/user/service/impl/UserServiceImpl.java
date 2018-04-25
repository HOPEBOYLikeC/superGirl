package com.wcapp.manage.user.service.impl;

import com.wcapp.manage.user.service.UserService;
import com.wcapp.mybatis.dao.PersonMapper;
import com.wcapp.mybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    PersonMapper personMapper;
    @Override
    public List<Map<?, ?>> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<Map<?, ?>> personShow() {
        return personMapper.personShow();
    }
}
