package com.teamlab.skillup.todo.Controller

import com.teamlab.skillup.todo.Service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/todo")
class TodoController(private val service: TodoService) {

    /**
     * index初期表示
     * Todo全件取得する
     * String型を返してるのにmain/resource/template配下のindex.htmlが反応すのか…
     * →その辺は優秀なフレームワークがよしなにやってくれてる
     */
    @GetMapping("")
    fun getIndexPage(model: Model): String {
        model.addAttribute("todoList", service.findAllTodo())
        return "index"
    }

    /**
     * Todo追加
     * 追加ボタン押下時のマッピング想定
     * insert後、全件取得してHTMLに反映させる
     */
    @PostMapping("")
    fun todoPost(todoName: String, timeLimit: String): String {
        service.insertAndAllTodoGet(todoName,timeLimit)
        return "index"
    }

    /**
     * Todo検索初期表示
     */
    @GetMapping("/search")
    fun getSearchPage(): String {
        return "search"
    }

    /**
     * Todo検索API
     * 検索後は検索されたもののみピックアップして表示する
     * フリーワード検索にしたい
     */
    @GetMapping("/search")
    fun searchResult(freeword: String): String {
        service.searchTodo(freeword)
        return "search"
    }

    /**
     * Todo編集ページ初期表示
     * 編集ボタン押下したら叩かれるAPI
     */
    @GetMapping("/edit")
    fun getEditPage(id: Int, model: Model): String {
        model.addAttribute("editTodo", service.findTodo(id))
        return "edit"
    }

    /**
     * Todo更新
     * 編集画面にて、更新ボタン押下したら叩かれるAPI
     * Updateが走る予定、その後はホームのindex.htmlに遷移する
     */
    @GetMapping("/edit")
    fun updateTodo(id: Int, model: Model): String {
        model.addAttribute("updateTodo", service.updateTodo(id))
        return "index"
    }
}