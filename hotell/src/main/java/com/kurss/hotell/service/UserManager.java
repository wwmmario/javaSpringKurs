package com.kurss.hotell.service;

import com.kurss.hotell.models.UserDto;
import com.kurss.hotell.models.UserEntity;

public interface UserManager {
    boolean userExists(String username);
    UserEntity createUser(UserDto userDto);
}
