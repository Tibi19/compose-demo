package com.tam.composedemo.demo.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterWithVM(counterVM: CounterVM = viewModel()) {
    val count = counterVM.count
    Column {
        Button(onClick = { counterVM.incrementCount() }) {
            Text(text = count.toString())
        }
    }
}