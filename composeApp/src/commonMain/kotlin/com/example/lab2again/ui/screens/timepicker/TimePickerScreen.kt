package com.example.lab2again.ui.screens.timepicker

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@Composable
fun TimePickerScreen() {

    var selectedTime by remember { mutableStateOf("No time selected") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(selectedTime)

        Button(onClick = {
            selectedTime = "12:00"
        }) {
            Text("Pick Time")
        }
    }
}

@Preview
@Composable
fun TimePickerScreenPreview() {
    AppTheme {
        Scaffold {
            TimePickerScreen()
        }
    }
}