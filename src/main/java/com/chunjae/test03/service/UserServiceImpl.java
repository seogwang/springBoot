package com.chunjae.test03.service;

import com.chunjae.test03.domain.UserInfo;
import com.chunjae.test03.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    @Override
    public UserInfo getUser(String id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<UserInfo> userList() {
        return userMapper.userList();
    }

    @Override
    public void userInsert(UserInfo dto) {
        userMapper.userInsert(dto);
    }

    @Override
    public void userUpdate(UserInfo dto) {
        userMapper.userUpdate(dto);
    }

    @Override
    public void editAct(UserInfo dto) {
        userMapper.editAct(dto);
    }
}
