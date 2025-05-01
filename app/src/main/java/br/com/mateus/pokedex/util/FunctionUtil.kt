package br.com.mateus.pokedex.util

import androidx.compose.ui.graphics.Color

object FunctionUtil {
    fun backgroundColorTypePokemon(
        type: String
    ): Color{
        return when(type) {
            "grass" -> Color(0xFF89D74E)
            "fire" -> Color(0xFFFB5643)
            "water" -> Color(0xFF57ADFF)
            "bug" -> Color(0xFFC3D21E)
            "normal" -> Color(0xFFB6B7A9)
            "poison" -> Color(0xFFA75BA1)
            "electric" -> Color(0xFFFCE53D)
            "ground" -> Color(0xFFE9C654)
            "fighting" -> Color(0xFFA75845)
            "ghost" -> Color(0xFF7A74D6)
            "psychic" -> Color(0xFFF461B0)
            "rock" -> Color(0xFFD0BD72)
            "steel" -> Color(0xFFC4C2DA)
            "flying" -> Color(0xFF7BA4FF)
            "ice" -> Color(0xFF95F1FE)
            "dragon" -> Color(0xFF8974FE)
            "dark" -> Color(0xFF8F6955)
            "fairy" -> Color(0xFFFAADFF)
            else -> Color.Gray
        }
    }
}