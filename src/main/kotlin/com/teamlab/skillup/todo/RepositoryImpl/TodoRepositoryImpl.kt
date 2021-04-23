package com.teamlab.skillup.todo.RepositoryImpl

import com.teamlab.skillup.todo.Dao.TodoDao
import com.teamlab.skillup.todo.Entity.TodoEntity
import com.teamlab.skillup.todo.Repository.TodoRepository
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl(
        private val dao: TodoDao
): TodoRepository {
    override fun insertTodo(todoName: String, timeLimit: String): Int =
        dao.insertTodo(todoName, timeLimit)
    override fun findAllTodo(): List<TodoEntity> =
        dao.selectAllTodo()
    override fun findTodoById(id: Int): TodoEntity =
        dao.selectTodoById(id)
    override fun findTodoByFreeword(freeword: String): List<TodoEntity> =
        dao.findTodoByFreeword(freeword)
    override fun updateTodoById(id: Int): TodoEntity =
        dao.updateTodoById(id)
    // 完了/未完了フラグを逆にupdateする
    override fun updateDoneFlagById(id: Int): TodoEntity =
        dao.updateDoneFlagById(id)
}