package com.tam.composedemo.demo.dialog

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun ShowDialog() {

    var isDialogOpen by remember{ mutableStateOf(false)}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { isDialogOpen = true }) {
            Text(text = "Show Dialog")
        }
    }

    if(isDialogOpen) {
        Dialog(onDismissRequest = { isDialogOpen = false }) {
            Card {
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Do you wanna... dialog?")
                    Button(onClick = { isDialogOpen = false }) {
                        Text(text = "No")
                    }
                }
            } // Dialog Content
        }
    }

}