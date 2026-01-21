package com.danilo.todos.service;

import com.danilo.todos.dto.request.TodoRequest;
import com.danilo.todos.dto.response.TodoResponse;

import java.nio.file.AccessDeniedException;
import java.util.List;

public interface TodoService {
    TodoResponse createTodo(TodoRequest todoRequest) throws AccessDeniedException;
    List<TodoResponse> getAllTodos() throws AccessDeniedException;
    TodoResponse toggleTodoCompletion(Long id) throws AccessDeniedException;
    void deleteTodo(Long id) throws AccessDeniedException;
}
