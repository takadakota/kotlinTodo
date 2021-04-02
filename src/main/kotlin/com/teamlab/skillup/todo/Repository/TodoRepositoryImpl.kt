package com.teamlab.skillup.todo.Repository

import com.teamlab.skillup.todo.Dao.TodoDao
import com.teamlab.skillup.todo.Entity.TodoEntity
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(private val todoDao: TodoDao) {
    fun insertTodo(todoName: String, timeLimit: String): Int {
        return todoDao.insertTodo(todoName, timeLimit)
    }
    fun selectAllTodo(): List<TodoEntity> {
        return todoDao.selectAllTodo()
    }
}