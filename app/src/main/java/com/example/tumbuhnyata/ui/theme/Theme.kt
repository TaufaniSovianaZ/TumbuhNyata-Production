package com.example.tumbuhnyata.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF6200EA)
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EA)
)

@Composable
fun TumbuhNyataTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colors,
        typography = TumbuhNyataTypography,
        content = content
    )
}
