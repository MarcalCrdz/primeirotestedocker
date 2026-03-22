package com.devops.todoapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoRepository repo;

    public  TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Todo> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Todo criar(@RequestBody Todo todo) {
        return repo.save(todo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
