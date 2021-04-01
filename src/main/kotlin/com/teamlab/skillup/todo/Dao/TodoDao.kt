package com.teamlab.skillup.todo.Dao

import org.seasar.doma.Insert

interface TodoDao {
    @Insert
    fun insertTodo(todoName: String, timeLimit: String): Int
}