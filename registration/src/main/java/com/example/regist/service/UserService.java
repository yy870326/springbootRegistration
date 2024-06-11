package com.example.regist.service;

import com.example.regist.dto.UserDto;
import com.example.regist.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
