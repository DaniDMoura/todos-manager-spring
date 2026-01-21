package com.danilo.todos.dto.response;

import java.time.Instant;

public record ExceptionResponse(
        int status,
        String messagem,
        Instant timestamp
) {
}
