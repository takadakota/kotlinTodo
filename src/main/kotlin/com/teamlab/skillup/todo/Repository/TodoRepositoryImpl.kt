package com.teamlab.skillup.todo.Repository

import com.teamlab.skillup.todo.Dao.TodoDao
import org.apache.catalina.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(private val todoDao: TodoDao) {

    fun insertTodo(TodoName: String, timeLimit: String) {
        todoDao.insertTodo(TodoName, timeLimit)
    }
}