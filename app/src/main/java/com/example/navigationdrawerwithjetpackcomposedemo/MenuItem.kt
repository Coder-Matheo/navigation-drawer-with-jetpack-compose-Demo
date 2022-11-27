package com.example.navigationdrawerwithjetpackcomposedemo

import androidx.compose.ui.graphics.vector.ImageVector


data class MenuItem(
    val id: String,
    val title: String,
    val conentDescription: String,
    val icon: ImageVector
)