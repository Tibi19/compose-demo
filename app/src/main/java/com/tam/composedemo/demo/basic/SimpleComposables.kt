package com.tam.composedemo.demo.basic

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tam.composedemo.ui.theme.ComposeDemoTheme

@Composable
fun SimpleComposables() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text = "This is a simple text")

        var inputText by remember { mutableStateOf("") }
        TextField(
            value = inputText,
            onValueChange = { inputText = it }
        )

        Button(
            onClick = { Log.d("CLICK_TAG", "Button clicked!") }
        ) {
            Text(text = "Click to print log")
        }

        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home Icon",
            tint = MaterialTheme.colors.primary,
        )

    }

}

@Preview(showBackground = true)
@Composable
fun SimpleComposablesPreview() {
    ComposeDemoTheme {
        SimpleComposables()
    }
}