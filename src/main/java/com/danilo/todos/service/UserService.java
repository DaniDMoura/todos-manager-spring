package com.danilo.todos.service;

import com.danilo.todos.dto.request.PasswordUpdateRequest;
import com.danilo.todos.dto.response.UserResponse;
import com.danilo.todos.entity.User;

import java.nio.file.AccessDeniedException;

public interface UserService {
    UserResponse getUserInfo() throws AccessDeniedException;
    void deleteUser() throws AccessDeniedException;
    void updatePassword(PasswordUpdateRequest request) throws AccessDeniedException;
}
