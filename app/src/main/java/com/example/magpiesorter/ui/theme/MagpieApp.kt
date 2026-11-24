package com.example.magpiesorter.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MagpieApp(modifier: Modifier = Modifier) {
    MagpieHome(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}