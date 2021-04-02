package com.teamlab.skillup.todo.Dao

import com.teamlab.skillup.todo.Entity.TodoEntity
import org.seasar.doma.Dao
import org.seasar.doma.Insert
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable

@ConfigAutowireable
@Dao
interface TodoDao {
    @Insert
    fun insertTodo(todoName: String, timeLimit: String): Int
    @Select
    fun selectAllTodo(): List<TodoEntity>
}