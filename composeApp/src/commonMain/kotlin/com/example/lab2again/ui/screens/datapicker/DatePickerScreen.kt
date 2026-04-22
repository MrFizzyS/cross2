package com.example.lab2again.ui.screens.datepicker

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme
import kotlinx.datetime.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerScreen() {

    var showPicker by remember { mutableStateOf(false) }
    var selectedDateText by remember { mutableStateOf("No date selected") }

    val datePickerState = rememberDatePickerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(selectedDateText)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            showPicker = true
        }) {
            Text("Pick Date")
        }
    }

    if (showPicker) {
        DatePickerDialog(
            onDismissRequest = { showPicker = false },
            confirmButton = {
                TextButton(onClick = {
                    val millis = datePickerState.selectedDateMillis
                    if (millis != null) {
                        val date = Instant.fromEpochMilliseconds(millis)
                            .toLocalDateTime(TimeZone.currentSystemDefault())
                            .date
                        selectedDateText = date.toString()
                    }
                    showPicker = false
                }) {
                    Text("OK")
                }
            },
            dismissButton = {
                TextButton(onClick = { showPicker = false }) {
                    Text("Cancel")
                }
            }
        ) {
            DatePicker(state = datePickerState)
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