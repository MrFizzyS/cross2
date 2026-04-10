package com.example.lab2again.ui.screens.chips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.theme.AppTheme

@Composable
fun ChipsScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        AssistChip(
            onClick = { },
            label = { Text("Simple Chip") }
        )
    }
}

@Preview
@Composable
fun ChipsScreenPreview() {
    AppTheme {
        Scaffold {
            ChipsScreen()
        }
    }
}