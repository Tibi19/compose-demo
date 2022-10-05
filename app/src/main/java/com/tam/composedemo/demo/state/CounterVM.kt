package com.tam.composedemo.demo.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class CounterVM: ViewModel() {

    var count: Int by mutableStateOf(0)
        private set

    fun incrementCount() { count++ }

}