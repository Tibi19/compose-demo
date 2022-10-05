package com.tam.composedemo.demo.glide

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun GlideExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Glide image")
        val imageUrl = "https://c4.wallpaperflare.com/wallpaper/547/358/482/fixed-apple-by-android-apple-and-android-i-fixed-it-meme-wallpaper-preview.jpg"
        GlideImage(
            imageModel = imageUrl,
            Modifier.size(300.dp)
        )
    }

}