package dev.laiso.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.*
import androidx.ui.core.setContent

@Model
public data class TodoItem(val title: String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val items = listOf<TodoItem>(
            TodoItem("todo item 01"),
            TodoItem("todo item 02"),
            TodoItem("my todo item 03")
        )
        setContent { SimpleComposable(items = items) }
    }
}
