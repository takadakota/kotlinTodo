package com.teamlab.skillup.todo.Service

import com.teamlab.skillup.todo.Entity.TodoEntity
import com.teamlab.skillup.todo.Repository.TodoRepositoryImpl

class TodoService(private val repository: TodoRepositoryImpl) {
    fun insertAndAllTodoGet(todoName: String, timeLimit: String): List<TodoEntity> {
        repository.insertTodo(todoName, timeLimit)
        return repository.selectAllTodo()
    }
}