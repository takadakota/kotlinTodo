package com.teamlab.skillup.todo.RepositoryImpl

import com.teamlab.skillup.todo.Dao.TodoDao
import com.teamlab.skillup.todo.Entity.TodoEntity
import com.teamlab.skillup.todo.Repository.TodoRepository
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(
        private val todoDao: TodoDao
): TodoRepository {
    override fun insertTodo(todoName: String, timeLimit: String): Int {
        return todoDao.insertTodo(todoName, timeLimit)
    }
    override fun findAllTodo(): List<TodoEntity> {
        return todoDao.selectAllTodo()
    }
    override fun findTodoById(id: Int): TodoEntity {
        return todoDao.selectTodoById(id)
    }
    override fun findTodoByFreeword(freeword: String): List<TodoEntity> {
        return todoDao.findTodoByFreeword(freeword)
    }
    override fun updateTodoById(id: Int): TodoEntity {
        return todoDao.updateTodoById(id)
    }
    // 完了/未完了フラグを逆にupdateする
    override fun updateDoneFlagById(id: Int): TodoEntity {
        return todoDao.updateDoneFlagById(id)
    }
}