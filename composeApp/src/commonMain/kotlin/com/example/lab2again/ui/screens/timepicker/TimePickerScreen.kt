package com.example.lab2again.ui.screens.timepicker

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerScreen() {

    var showPicker by remember { mutableStateOf(false) }
    var selectedTime by remember { mutableStateOf("No time selected") }

    val timePickerState = rememberTimePickerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(selectedTime)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            showPicker = true
        }) {
            Text("Pick Time")
        }
    }

    if (showPicker) {
        AlertDialog(
            onDismissRequest = { showPicker = false },
            confirmButton = {
                TextButton(onClick = {
                    val hour = timePickerState.hour
                    val minute = timePickerState.minute
                    val formattedHour = hour.toString().padStart(2, '0')
                    val formattedMinute = minute.toString().padStart(2, '0')
                    selectedTime = "$formattedHour:$formattedMinute"
                    showPicker = false
                }) {
                    Text("OK")
                }
            },
            dismissButton = {
                TextButton(onClick = { showPicker = false }) {
                    Text("Cancel")
                }
            },
            text = {
                TimePicker(state = timePickerState)
            }
        )
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