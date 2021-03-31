package com.teamlab.skillup.todo.Dao

interface TodoDao {
    //doma使いたいのでなんとかする…
    @Insert
    fun insertTodo(TodoName: String, timeLimit: String): Int
}