package com.example.lab2again.ui.screens.divider

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@Composable
fun DividerScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text("Above")

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        Text("Below")
    }
}

@Preview
@Composable
fun DividerScreenPreview() {
    AppTheme {
        Scaffold {
            DividerScreen()
        }
    }
}