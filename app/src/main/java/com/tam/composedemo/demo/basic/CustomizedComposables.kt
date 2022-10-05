package com.tam.composedemo.demo.basic

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.composedemo.ui.theme.ComposeDemoTheme

@Composable
fun CustomizedComposables() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "This is a customized text that will eventually overflow with dots",
            style = TextStyle(
                color = Color(0xFF521313),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            ),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .padding(vertical = 50.dp)
        )

        var inputText by remember { mutableStateOf("") }
        TextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text(text = "Input") },
            placeholder = { Text(text = "Start input...") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Home Icon",
                    tint = Color.Blue,
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xAA9FAEBD),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Blue,
                cursorColor = Color.Blue,
                textColor = Color.DarkGray,
                unfocusedLabelColor = Color.DarkGray,
                focusedLabelColor = Color.Blue,
                placeholderColor = Color(0xAA6B6B6B)
            ),
            shape = RectangleShape,
            singleLine = true
        )

        Button(
            onClick = { Log.d("CLICK_TAG", "Button clicked!") },
            elevation = ButtonDefaults.elevation(
                defaultElevation = 10.dp,
                pressedElevation = 1.dp
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF23A548),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(25.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .padding(top = 50.dp, bottom = 25.dp)
                .padding(horizontal = 20.dp)
        ) {
            Text(text = "Click to print log")
        }

        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home Icon",
            tint = MaterialTheme.colors.primary,
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .clickable { Log.d("CLICK_TAG", "Icon clicked!") }
        )

    }

}

@Preview(showBackground = true)
@Composable
fun CustomizedComposablesPreview() {
    ComposeDemoTheme {
        CustomizedComposables()
    }
}