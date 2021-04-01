package com.teamlab.skillup.todo.Controller

import com.teamlab.skillup.todo.Repository.TodoRepositoryImpl
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/todo")
class TodoController(private val repository: TodoRepositoryImpl) {

    @GetMapping("")
    fun todo(): String {
        return "index"
    }
    @PostMapping("")
    fun todoPost(TodoName: String, timeLimit: String): String {
        repository.insertTodo(TodoName,timeLimit)
        return "index"
    }

    @GetMapping("/search")
    fun search(): String {
        return "search"
    }

    @GetMapping("/edit")
    fun edit(): String {
        return "edit"
    }
}