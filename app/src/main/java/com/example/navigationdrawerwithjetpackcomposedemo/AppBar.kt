package com.example.navigationdrawerwithjetpackcomposedemo

import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource

@Composable
fun AppBar(
    onNavigationIconClick: () -> Unit
) {
    val context = LocalContext.current
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary,
        navigationIcon = {
            IconButton(onClick =  onNavigationIconClick ) {
                Icon(imageVector = Icons.Default.Menu,
                contentDescription = "Toggle drawer")
                Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
            }
        }
    )
}