package com.teamlab.skillup.todo.Controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/todo")
class TodoController {

    @GetMapping("")
    fun todo(): String = "todo"
    @PutMapping("")
    fun todoPut(): String = "todo"

    @GetMapping("/search")
    fun search(): String = "search"

    @GetMapping("/edit")
    fun edit(): String = "edit"
}