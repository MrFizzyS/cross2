package com.example.lab2again.ui.screens.dialog

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@Composable
fun DialogScreen() {

    var open by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Button(onClick = { open = true }) {
            Text("Show Dialog")
        }

        if (open) {
            AlertDialog(
                onDismissRequest = { open = false },
                confirmButton = {
                    Button(onClick = { open = false }) {
                        Text("OK")
                    }
                },
                title = { Text("Dialog") },
                text = { Text("Це простий діалог") }
            )
        }
    }
}

@Preview
@Composable
fun DialogScreenPreview() {
    AppTheme {
        Scaffold {
            DialogScreen()
        }
    }
}