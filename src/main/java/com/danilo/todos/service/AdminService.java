package com.danilo.todos.service;

import com.danilo.todos.dto.response.UserResponse;

import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();
    UserResponse promoteToAdmin(Long userId);
    void deleteNonAdminUser(Long userId);
}
