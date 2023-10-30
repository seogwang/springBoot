package com.chunjae.test03.service;

import com.chunjae.test03.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public UserInfo getUser(String id);
    public List<UserInfo> userList();
    public void userInsert(UserInfo dto);
    public void userUpdate(UserInfo dto);
    public void editAct(UserInfo dto);
}
