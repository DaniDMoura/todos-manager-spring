package com.danilo.todos.controller;

import com.danilo.todos.dto.request.TodoRequest;
import com.danilo.todos.dto.response.TodoResponse;
import com.danilo.todos.entity.Todo;
import com.danilo.todos.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
@Tag(name = "Todo REST API Endpoints", description = "Operations for managing user todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @Operation(summary = "Create todo for user", description = "Create todo for signed user")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public TodoResponse createTodo(@Valid @RequestBody TodoRequest todoRequest) throws Exception {
        return todoService.createTodo(todoRequest);
    }

    @Operation(summary = "Get all todos for user", description = "Fetch all todo for signed user")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<TodoResponse> getAllTodos() throws Exception {
        return todoService.getAllTodos();
    }

    @Operation(summary = "Update todo for user", description = "Update todo for signed user")
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public TodoResponse toggleTodoCompletion(@Min(1) @PathVariable Long id) throws Exception {
        return todoService.toggleTodoCompletion(id);
    }

    @Operation(summary = "Delete todo for user", description = "Delete todo for signed user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteTodo(@Min(1) @PathVariable Long id) throws Exception {
        todoService.deleteTodo(id);
    }
}
