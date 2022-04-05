package dev.gihan.invoicemaker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF061B4D),
    primaryVariant = Color(0xFF677EB5),
    secondary = Color(0xFF00AEEF),
    secondaryVariant = Color(0xFF9BEB46),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFFF8141),
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFFFFFFFF),
    onBackground = Color(0xFF585858),
    onSurface = Color(0xFF585858),
    onError = Color(0xFFFFFFFF)
)
val defaultLightColors = lightColors(
    primary = Color(0xFF061B4D),
    primaryVariant = Color(0xFF677EB5),
    secondary = Color(0xFF00AEEF),
    secondaryVariant = Color(0xFF9BEB46),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFFF8686),
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFFFFFFFF),
    onBackground = Color(0xFF585858),
    onSurface = Color(0xFF585858),
    onError = Color(0xFFFFFFFF)
)


@Composable
fun AppUITheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        LightColorPalette
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