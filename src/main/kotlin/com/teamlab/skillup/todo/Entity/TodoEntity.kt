package com.teamlab.skillup.todo.Entity

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "TodoList_info")
data class TodoEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(name = "todoName")
        val todoName: String,

        @Column(name = "timeLimit")
        val timeLimit: String,

        @Column(name = "doneFlag")
        val doneFlag: Boolean,

        @Column(name = "createDate")
        val createDate: LocalDate,

        @Column(name = "updateTime")
        val updateTime: LocalDateTime
)