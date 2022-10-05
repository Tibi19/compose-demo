package com.tam.composedemo.demo.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tam.composedemo.R

@Composable
fun BoxParent() {

    Box(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Text in a box",
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.TopStart)
        )

        Button(
            onClick = {},
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.BottomStart)
        ) {
            Text(text = "Button in a box")
        }

        Icon(
            painter = painterResource(id = R.drawable.ic_cat),
            contentDescription = "Cat in a box",
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.CenterEnd)
        )

    }


}