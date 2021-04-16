package com.teamlab.skillup.todo.Repository

import com.teamlab.skillup.todo.Entity.TodoEntity
import org.seasar.doma.Insert
import org.seasar.doma.Select
import org.seasar.doma.Update

interface TodoRepository {
    @Insert
    fun insertTodo(todoName: String, timeLimit: String): Int
    @Select
    fun findAllTodo(): List<TodoEntity>
    @Select
    fun findTodoById(id: Int): TodoEntity
    @Select
    fun findTodoByFreeword(freeword: String): List<TodoEntity>
    @Update
    fun updateTodoById(id: Int): TodoEntity
    // 完了/未完了フラグを逆にupdateする
    @Update(sqlFile = true)
    fun updateDoneFlagById(id: Int): TodoEntity
}