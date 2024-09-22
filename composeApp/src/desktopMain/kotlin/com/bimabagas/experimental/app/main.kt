package com.bimabagas.experimental.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-Experimental",
    ) {
        App()
    }
}