package com.teamlab.skillup.todo.Controller

import com.teamlab.skillup.todo.Repository.TodoRepositoryImpl
import com.teamlab.skillup.todo.Service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/todo")
class TodoController(private val service: TodoService) {

    /**
     * 初期表示API呼び出し
     * Todo全件取得する
     * String型を返してるのにmain/resource/template配下のindex.htmlが反応すのか…
     * →その辺は優秀なフレームワークがよしなにやってくれてる
     */
    @GetMapping("")
    fun todo(): String {
        service.selectAllTodo()
        return "index"
    }

    /**
     * Todo追加API呼び出し
     * insert後、全件取得してHTMLに反映させる
     */
    @PostMapping("")
    fun todoPost(todoName: String, timeLimit: String): String {
        service.insertAndAllTodoGet(todoName,timeLimit)
        return "index"
    }

    /**
     * Todo検索API呼び出し
     * 検索後は検索されたもののみピックアップして表示する
     * フリーワード検索にしたい
     */
    @GetMapping("/search")
    fun search(): String {
        return "search"
    }

    /**
     * Todo編集API呼び出し
     * 編集ボタン押下したら叩かれるAPI
     * Updateが走る予定、その後はホームのindex.htmlに遷移する
     */
    @GetMapping("/edit")
    fun edit(): String {
        return "edit"
    }
}