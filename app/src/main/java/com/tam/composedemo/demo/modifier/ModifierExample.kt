package com.tam.composedemo.demo.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tam.composedemo.ui.theme.ComposeDemoTheme

@Composable
fun ModifierExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .background(Color.Green)
                .padding(30.dp)
                .background(Color.Yellow)
                .padding(10.dp)
        ) {
            Text(text = "Modifier example")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ModifierExamplePreview() {
    ComposeDemoTheme {
        ModifierExample()
    }
}