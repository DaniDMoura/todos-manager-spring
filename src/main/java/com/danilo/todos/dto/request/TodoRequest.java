package com.danilo.todos.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record TodoRequest(

        @NotEmpty(message = "Title is mandatory")
        @Size(min = 3, max = 30, message = "Title must be at least 3 characters long")
        String title,

        @NotEmpty(message = "Description is mandatory")
        @Size(min = 3, max = 30, message = "Description must be at least 3 characters long")
        String description,

        @Min(1)
        @Max(5)
        int priority
) {
}
