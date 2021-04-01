package com.teamlab.skillup.todo.Repository

import com.teamlab.skillup.todo.Dao.TodoDao
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(private val todoDao: TodoDao) {

    fun insertTodo(todoName: String, timeLimit: String) {
        todoDao.insertTodo(todoName, timeLimit)
    }
}