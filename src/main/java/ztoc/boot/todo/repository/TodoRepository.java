package ztoc.boot.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ztoc.boot.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
