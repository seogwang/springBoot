package com.chunjae.test03.persistence;

import com.chunjae.test03.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public UserInfo getUser(String id);
    public List<UserInfo> userList();
    public void userInsert(UserInfo dto);
    public void userUpdate(UserInfo dto);
    public void editAct(UserInfo dto);
}
