package com.example.lab2again

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab2again.ui.screens.AppNavigation
import com.example.lab2again.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    AppTheme {
        AppNavigation()
    }
}