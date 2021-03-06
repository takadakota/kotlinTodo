package com.teamlab.skillup.todo.Service

import com.teamlab.skillup.todo.Entity.TodoEntity
import com.teamlab.skillup.todo.RepositoryImpl.TodoRepositoryImpl
import org.springframework.stereotype.Service

@Service
class TodoService(private val repository: TodoRepositoryImpl) {
    fun findAllTodo() {
        repository.findAllTodo()
    }
    fun insertAndAllTodoGet(todoName: String, timeLimit: String): List<TodoEntity> {
        repository.insertTodo(todoName, timeLimit)
        return repository.findAllTodo()
    }
    fun findTodo(id: Int): TodoEntity {
        return repository.findTodoById(id)
    }
    fun searchTodo(freeword: String): List<TodoEntity> {
        return repository.findTodoByFreeword(freeword)
    }
    fun updateTodo(id: Int): TodoEntity {
        repository.updateTodoById(id)
        return repository.findTodoById(id)
    }
    fun switchDoneFlag(id: Int) {
        // 完了なら未完了、未完了なら完了にupdate
        repository.updateDoneFlagById(id)
    }
}