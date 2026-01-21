package com.danilo.todos.util;

import com.danilo.todos.entity.User;

import java.nio.file.AccessDeniedException;

public interface FindAuthenticatedUser {
    User getAuthenticatedUser() throws AccessDeniedException;
}
