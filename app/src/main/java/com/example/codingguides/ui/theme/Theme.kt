package com.example.codingguides.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = white1,
    onPrimary = Black1,
    surface = white2,
    onSurface = Black1,
)

private val LightColorPalette = lightColors(
    primary = white1,
    onPrimary = Black1,
    surface = white2,
    onSurface = Black1,

    /* Other default colors to override
    background = Color.White,


    onSecondary = Color.Black,
    onBackground = Color.Black,

    */
)

@Composable
fun CodingGuidesTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}