package com.tam.composedemo.demo.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CounterWithRemember() {
    var count by remember { mutableStateOf(0) }
    Column {
        Button(onClick = { count++ }) {
            Text(text = count.toString())
        }
    }
}