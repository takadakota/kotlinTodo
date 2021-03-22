package com.teamlab.skillup.todo.Controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TodoController {

    @GetMapping("/")
    fun todo(model: Model): String = "todo"
}