package com.example.magpiesorter.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Collection(
    val name: String,
    val id: Int,
    val items: MutableList<Item> = mutableListOf()
)
