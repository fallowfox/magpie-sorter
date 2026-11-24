package com.example.magpiesorter.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.example.magpiesorter.model.Collection

@Composable
fun CreateCollection(modifier: Modifier = Modifier, add: (Collection) -> Unit) {
    var collectionName by remember { mutableStateOf("") }

    Column(modifier = modifier) {

        TextField(
            value = collectionName,
            onValueChange = { collectionName = it },
            label = { Text("Enter collection name: ") },
            modifier = modifier
        )
        Button(
            onClick = {
                val newCollection = Collection(
                        name = collectionName,
                        id = 0
                    )
                add(newCollection)
                collectionName =""

            }
        ) {
            Text("Create Collection")
        }
    }
}

