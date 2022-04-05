package dev.gihan.invoicemaker.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.gihan.invoicemaker.R

val RedHatText = FontFamily(
    Font(R.font.rh_bold, FontWeight.Bold),
    Font(R.font.rh_semibold, FontWeight.SemiBold),
    Font(R.font.rh_medium, FontWeight.Medium),
    Font(R.font.rh_regular, FontWeight.Normal),
    Font(R.font.rh_light, FontWeight.Thin),
    Font(R.font.rh_light, FontWeight.Light),
)

val Typography = Typography(
    defaultFontFamily = RedHatText,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 48.sp,
        letterSpacing = (-1.5).sp,
        color = defaultLightColors.onSurface
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        letterSpacing = (-1.5).sp,
        color = defaultLightColors.onSurface
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 26.sp,
        letterSpacing = (-1.5).sp,
        color = defaultLightColors.onSurface
    ),
    h4 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        letterSpacing = 0.sp,
        color = defaultLightColors.onSurface
    ),
    h5 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        letterSpacing = 0.sp,
        color = defaultLightColors.onSurface
    ),
    h6 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        letterSpacing = 0.sp,
        color = defaultLightColors.onSurface
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.sp,
        color = defaultLightColors.onSurface
    ),
    subtitle2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        letterSpacing = (-1.5).sp,
        color = defaultLightColors.onSurface
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
        color = defaultLightColors.onSurface
    ),
    button = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        letterSpacing = 1.25.sp,
        color = defaultLightColors.onSurface
    ),
    overline = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        letterSpacing = 1.sp,
        color = defaultLightColors.onSurface
    )
)