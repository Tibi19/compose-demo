package com.tam.composedemo.demo.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

@Composable
fun CounterWithStateVariable() {
    val countState: MutableState<Int> = remember { mutableStateOf(0) }
    Column{
        Button(onClick = { incrementCount(countState) }) {
            Text(text = countState.value.toString())
        }
    }
}

private fun incrementCount(countState: MutableState<Int>) {
    countState.value++
}