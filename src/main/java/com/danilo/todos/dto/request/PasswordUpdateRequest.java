package com.danilo.todos.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record PasswordUpdateRequest(

        @NotEmpty(message = "Old password is mandatory")
        String oldPassword,

        @NotEmpty(message = "New password is mandatory")
        @Size(min = 8, message = "New password must be at least 8 characters long")
        String newPasswrod,

        @NotEmpty(message = "New password is mandatory")
        @Size(min = 8, message = "New password must be at least 8 characters long")
        String confirmPassword
) {
}
