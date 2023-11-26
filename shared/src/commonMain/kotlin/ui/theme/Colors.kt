package ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val primary: Color,
    val secondary: Color,
    val contentPrimary: Color,
    val contentSecondary: Color,
    val contentTertiary: Color,
    val contentBorder: Color,
    val surface: Color,
    val onPrimary: Color,
    val hover: Color,
    val background: Color,
    val disable: Color,
    val divider:Color,
    val success: Color,
    val successContainer: Color,
    val warning: Color,
    val warningContainer: Color,
    val surfaceTint: Color,
    val orange: Color,
)

val LightColors = Colors(
    primary = Color(0xFFFE5915), //orange
    secondary = Color(0xFF55ABD8),//blue
    contentPrimary = Color(0xDE1F0000),
    contentSecondary = Color(0x991F0000),
    contentTertiary = Color(0x611F0000),
    contentBorder = Color(0x141F0000),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color(0xFFFFFFFF),
    hover = Color(0xFFFFFAFA),
    background = Color(0xFFB1ADAC), //grey
    disable = Color(0xFFEE3067),//pink
    divider = Color(0xFF717171),//grey
    success = Color(0xFF41BE88),
    successContainer = Color(0xFFF0FFF7),
    warning = Color(0xFFF2BD00),
    warningContainer = Color(0xFFFFFCEB),
    surfaceTint = Color(0x081F0000),
    orange  = Color(0xFFFFE8CC),
)

val DarkColors = Colors(
    primary = Color(0xFFFE5915),
    secondary = Color(0x1AFFFFFF),
    contentPrimary = Color(0xDEFFFFFF),
    contentSecondary = Color(0x99FFFFFF),
    contentTertiary = Color(0x61FFFFFF),
    contentBorder = Color(0x14FFEFEF),
    surface = Color(0xFF1C1C1C),
    onPrimary = Color(0xFFFFFFFF),
    hover = Color(0xFF242424),
    background = Color(0xFF151515),
    disable = Color(0x40FFFFFF),
    divider = Color(0x14FFFFFF),
    success = Color(0xFF66CB9F),
    successContainer = Color(0x14EBFFF4),
    warning = Color(0xFFCBB567),
    warningContainer = Color(0x14FFFCEB),
    surfaceTint = Color(0x081F0000),
    orange  = Color(0xFF26231F),
)


