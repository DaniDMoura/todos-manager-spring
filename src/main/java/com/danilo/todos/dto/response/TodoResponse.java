package com.danilo.todos.dto.response;

public record TodoResponse(
        Long id,
        String title,
        String description,
        int priority,
        boolean complete
) {
}
