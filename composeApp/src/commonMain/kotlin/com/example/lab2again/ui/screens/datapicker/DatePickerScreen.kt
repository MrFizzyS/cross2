package com.example.lab2again.ui.screens.datepicker

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@Composable
fun DatePickerScreen() {

    var selectedDate by remember { mutableStateOf("No date selected") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(selectedDate)

        Button(onClick = {
            selectedDate = "2026-04-09" // просто приклад
        }) {
            Text("Pick Date")
        }
    }
}

@Preview
@Composable
fun DatePickerScreenPreview() {
    AppTheme {
        Scaffold {
            DatePickerScreen()
        }
    }
}