package com.tam.composedemo.demo.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.core.text.isDigitsOnly
import androidx.navigation.NavController
import com.tam.composedemo.demo.navigation.Destination

@Composable
fun HomeScreen(goToArgScreen: (argument: Int) -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var argumentInput by remember { mutableStateOf("") }
        TextField(
            value = argumentInput,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { argumentInput = it }
        )

        Button(onClick = {
            if(argumentInput.isNotEmpty() && argumentInput.isDigitsOnly()) {
                val argument = argumentInput.toInt()
                goToArgScreen(argument)
            }
        }) {
            Text(text = "Go to argument screen")
        }

    }

}