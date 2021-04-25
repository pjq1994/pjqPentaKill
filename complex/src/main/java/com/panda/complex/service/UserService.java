package com.panda.complex.service;

import com.panda.complex.entity.User;
import com.panda.complex.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User queryById(int id){
        return userMapper.queryById(id);
    }
}
