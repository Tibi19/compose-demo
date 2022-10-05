package com.tam.composedemo.demo.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ColumnParent() {

    Column {
        Text(text = "Text in column")
        Button(onClick = {}) {
            Text(text = "Button in column")
        }
    }

}