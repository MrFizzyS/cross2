package com.example.lab2again.ui.screens.radio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@Composable
fun RadioScreen() {

    var selected by remember { mutableStateOf("A") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selected == "A",
                onClick = { selected = "A" }
            )
            Text("Option A")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selected == "B",
                onClick = { selected = "B" }
            )
            Text("Option B")
        }
    }
}

@Preview
@Composable
fun RadioScreenPreview() {
    AppTheme {
        Scaffold {
            RadioScreen()
        }
    }
}