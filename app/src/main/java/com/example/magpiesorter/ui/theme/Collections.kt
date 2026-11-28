package com.example.magpiesorter.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat
import com.example.magpiesorter.model.Collection

@Composable
fun CollectionCard(
    collection: Collection,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
            )

            Text(
                text = collection.name,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Composable
fun CollectionsList(collectionList: List<Collection>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(collectionList)  { collection ->
            CollectionCard(
                collection = collection,
                modifier = Modifier.padding(8.dp)
            )

        }

        }
    }

@Composable
fun displayList(collectionList: List<Collection>){
    val layoutDirection = LocalLayoutDirection.current
    Surface(
        modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .padding(
            start = WindowInsets.safeDrawing.asPaddingValues()
                .calculateStartPadding(layoutDirection),
            end = WindowInsets.safeDrawing.asPaddingValues()
                .calculateEndPadding(layoutDirection),
            ),
    ){
        CollectionsList(
            collectionList = collectionList
        )
    }
}

//random collection just for my preview
@Preview
@Composable
fun CollectionCardPreview() {

    displayList(collectionList = testCollections)
}

val testCollections = listOf(
    Collection(name = "Coins", id = 1),
    Collection(name = "Medals", id = 2),
    Collection(name = "Stamps", id = 3)
)
@Composable
fun Collections(
    collectionList: List<Collection> = testCollections,
    modifier: Modifier = Modifier
) {
    displayList(collectionList = collectionList)
}