package com.teamlab.skillup.todo.Repository

import com.teamlab.skillup.todo.Dao.TodoDao
import com.teamlab.skillup.todo.Entity.TodoEntity
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(private val todoDao: TodoDao) {
    fun insertTodo(todoName: String, timeLimit: String): Int {
        return todoDao.insertTodo(todoName, timeLimit)
    }
    fun findAllTodo(): List<TodoEntity> {
        return todoDao.selectAllTodo()
    }
    fun findTodoById(id: Int): TodoEntity {
        return todoDao.selectTodoById(id)
    }
    fun findTodoByFreeword(freeword: String): List<TodoEntity> {
        return todoDao.findTodoByFreeword(freeword)
    }
    fun updateTodoById(id: Int): TodoEntity {
        return todoDao.updateTodoById(id)
    }
    // 完了/未完了フラグを逆にupdateする
    fun updateDoneFlagById(id: Int): TodoEntity {
        return todoDao.updateDoneFlagById(id)
    }
}