package com.ecommerce.demo.services;

import com.ecommerce.demo.models.role.Role;
import com.ecommerce.demo.models.user.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
