package com.tam.composedemo.demo.layout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnParent() {

    LazyColumn {

        item() {
            Text(
                text = "Header",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth()
            )
        }

        items(count = 50) { index ->
            Text(
                text = "Text $index",
                modifier = Modifier.padding(30.dp)
            )
            Divider(thickness = 1.dp)
        }

    }

}