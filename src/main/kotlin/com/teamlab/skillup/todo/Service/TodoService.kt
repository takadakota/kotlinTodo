package com.teamlab.skillup.todo.Service

import com.teamlab.skillup.todo.Entity.TodoEntity
import com.teamlab.skillup.todo.Repository.TodoRepositoryImpl

class TodoService(private val repository: TodoRepositoryImpl) {
    fun selectAllTodo() {
        repository.findAllTodo()
    }
    fun insertAndAllTodoGet(todoName: String, timeLimit: String): List<TodoEntity> {
        repository.insertTodo(todoName, timeLimit)
        return repository.findAllTodo()
    }
    fun selectTodo(id: Int): TodoEntity {
        return repository.findTodoById(id)
    }
    fun searchTodo(freeword: String) {
        return repository.findTodoByFreeword(freeword)
    }
}