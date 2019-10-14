package dev.laiso.todo

import androidx.compose.*
import androidx.ui.core.Dp
import androidx.ui.core.Alignment
import androidx.ui.layout.*


@Composable
fun SimpleComposable(items: List<TodoItem>) {
    MaterialTheme {
        Column {
            Text(text = "Todos", style = +themeTextStyle { h1 })
            Text(text = "Inbox", style = +themeTextStyle { h2 })

            items.forEach {
                Padding(padding = Dp(10F)) {
                    Row(crossAxisAlignment = CrossAxisAlignment.Center) {
                        Checkbox(checked = false, onCheckedChange = { })
                        WidthSpacer(width = Dp(10F))
                        Text(text = it.title, style = +themeTextStyle { h3 })
                    }
                }
            }

            Padding(padding = Dp(10F)) {
                Align(alignment = Alignment.BottomRight) {
                    Button(text = "Add")
                }
            }
        }
    }
}