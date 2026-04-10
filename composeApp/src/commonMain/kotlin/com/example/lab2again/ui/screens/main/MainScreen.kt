package com.example.lab2again.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lab2again.composeapp.generated.resources.Res
import lab2again.composeapp.generated.resources.buttons
import lab2again.composeapp.generated.resources.checkboxes
import org.jetbrains.compose.resources.stringResource

@Composable
fun MainScreen(
    onButtonsClicked: () -> Unit,
    onCheckboxesClicked: () -> Unit,
    onChipsClicked: () -> Unit,
    onDatePickerClicked: () -> Unit,
    onDialogClicked: () -> Unit,
    onDividerClicked: () -> Unit,
    onProgressClicked: () -> Unit,
    onRadioClicked: () -> Unit,
    onSwitchClicked: () -> Unit,
    onTimePickerClicked: () -> Unit,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                onButtonsClicked()
            }
        ) {
            Text(stringResource(Res.string.buttons))
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                onCheckboxesClicked()
            }
        ) {
            Text(stringResource(Res.string.checkboxes))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onChipsClicked() }
        ) {
            Text("Chips")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onDatePickerClicked() }
        ) {
            Text("DatePicker")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onDialogClicked() }
        ) {
            Text("Dialog")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onDividerClicked() }
        ) {
            Text("Divider")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onProgressClicked() }
        ) {
            Text("Progress")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onRadioClicked() }
        ) {
            Text("Radio")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onSwitchClicked() }
        ) {
            Text("Switch")
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onTimePickerClicked() }
        ) {
            Text("TimePicker")
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen(
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {}
    )
}