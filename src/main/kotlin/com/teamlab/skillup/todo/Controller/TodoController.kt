package com.teamlab.skillup.todo.Controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping

@Controller
class TodoController {

    @GetMapping("/home")
    fun todo(model: Model): String = "todo"

    @PutMapping("/add")
    fun add(model: Model): String = "add"

    @PutMapping("/edit")
    fun edit(model: Model): String = "edit"
}