package com.apap.tutorial8.service;

import com.apap.tutorial8.model.UserRoleModel;

public interface UserRoleService {
    UserRoleModel addUser(UserRoleModel user);
    void editPassword(String password, String username);
    UserRoleModel findByUsername(String username);
    public String encrypt(String password);
}
