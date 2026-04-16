package com.example.lab2again

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.window.ComposeUIViewController
import lab2again.composeapp.generated.resources.Res
import lab2again.composeapp.generated.resources.find_meeting
import lab2again.composeapp.generated.resources.world_clocks

import org.jetbrains.compose.resources.stringResource
import com.example.lab2again.ui.shared_mobile.main.MainScreen

@OptIn(ExperimentalMaterial3Api::class)
fun MainViewController() = ComposeUIViewController {
    MainScreen {
        TopAppBar(
            title = {
                when (it) {
                    0 -> Text(text = stringResource(Res.string.world_clocks))
                    else -> Text(text = stringResource(Res.string.find_meeting))
                }
            }
        )
    }

}