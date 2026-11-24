package com.example.magpiesorter.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.magpiesorter.R

@Preview(showBackground = true)
@Composable
fun MagpieHome(modifier: Modifier = Modifier){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally){
        Button(
            onClick = {}
        ){
            Text(text= stringResource(R.string.welcome))
        }
        Button(
            onClick = {}
        ){
            Text(text= stringResource(R.string.welcome2))
        }
    }

}
