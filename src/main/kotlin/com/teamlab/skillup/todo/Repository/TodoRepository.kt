package com.teamlab.skillup.todo.Repository

import com.teamlab.skillup.todo.Entity.TodoEntity

interface TodoRepository {
    fun insertTodo(todoName: String, timeLimit: String): Int
    fun findAllTodo(): List<TodoEntity>
    fun findTodoById(id: Int): TodoEntity
    fun findTodoByFreeword(freeword: String): List<TodoEntity>
    fun updateTodoById(id: Int): TodoEntity
    // 完了/未完了フラグを逆にupdateする
    fun updateDoneFlagById(id: Int): TodoEntity
}