package com.example.lab2again

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.example.lab2again.ui.shared_mobile.main.MainScreen

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        MainScreen()
    }
}