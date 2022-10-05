package com.tam.composedemo.demo.layout

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutParent() {

    ConstraintLayout {
        val (text1Ref, text2Ref, buttonRef) = createRefs()

        Text(
            text = "Guess who's back",
            modifier = Modifier.constrainAs(text1Ref) {
                top.linkTo(parent.top, margin = 15.dp)
                start.linkTo(parent.start, margin = 15.dp)
            }
        )
        Text(
            text = "Back",
            modifier = Modifier.constrainAs(text2Ref) {
                top.linkTo(text1Ref.bottom, margin = 16.dp)
                start.linkTo(text1Ref.end, margin = 32.dp)
            }
        )
        Button(
            onClick = {},
            modifier = Modifier.constrainAs(buttonRef) {
                top.linkTo(text2Ref.bottom)
                start.linkTo(text1Ref.end)
            }
        ) {
            Text(text = "Again")
        }
    }

}