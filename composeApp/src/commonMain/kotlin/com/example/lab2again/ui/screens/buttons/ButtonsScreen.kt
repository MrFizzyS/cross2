package com.example.lab2again.ui.screens.buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import lab2again.composeapp.generated.resources.Res
import lab2again.composeapp.generated.resources.buttons
import org.jetbrains.compose.resources.stringResource

@Composable
fun ButtonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
    ) {
        Text(stringResource(Res.string.buttons))
    }
}