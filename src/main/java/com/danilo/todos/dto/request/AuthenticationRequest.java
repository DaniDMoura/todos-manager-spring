package com.danilo.todos.dto.request;

public record AuthenticationRequest(
        String email,
        String password
) {
}
