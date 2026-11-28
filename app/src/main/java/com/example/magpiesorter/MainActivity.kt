package com.example.magpiesorter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.magpiesorter.ui.theme.MagpieSorterTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import com.example.magpiesorter.MagpieAppNav
import com.example.magpiesorter.ui.theme.MagpieHome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MagpieSorterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    MagpieAppNav()
                }
            }
        }
    }
}

@Preview
@Composable
fun MagpieApp(modifier: Modifier = Modifier) {
    MagpieHome(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

