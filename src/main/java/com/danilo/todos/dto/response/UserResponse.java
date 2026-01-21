package com.danilo.todos.dto.response;


import com.danilo.todos.entity.Authority;

import java.util.List;

public record UserResponse(
        Long id,
        String fullName,
        String email,
        List<Authority> authorities) {
}
