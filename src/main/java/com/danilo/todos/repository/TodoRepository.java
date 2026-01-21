package com.danilo.todos.repository;

import com.danilo.todos.entity.Todo;
import com.danilo.todos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {
    List<Todo> findByOwner(User user);
    Optional<Todo> findByIdAndOwner(Long id, User user);
}
