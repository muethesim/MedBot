package com.project.healthcarebot.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.WifiOff
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.window.DialogProperties
import com.project.healthcarebot.R

@Composable
fun NetworkStateAlertDialog(
    onRetry: () -> Unit,
    onDismiss: () -> Unit,
    showDialog: State<Boolean>,
) {
    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            icon = {
                   Icon(imageVector = Icons.Default.WifiOff, contentDescription = null)
            },
            title = { Text(text = stringResource(R.string.no_internet_connection)) },
            text = { Text(text = stringResource(R.string.please_check_your_internet_connection_and_try_again)) },
            confirmButton = {
                TextButton(
                    onClick = { onRetry() }
                ) {
                    Text(stringResource(R.string.retry))
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { onDismiss() }
                ) {
                    Text(stringResource(R.string.close))
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            )
        )
    }
}
