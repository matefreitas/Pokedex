package br.com.mateus.pokedex.util

import androidx.compose.ui.graphics.Color
import br.com.mateus.pokedex.data.model.Stat
import br.com.mateus.pokedex.ui.theme.BugColor
import br.com.mateus.pokedex.ui.theme.DarkColor
import br.com.mateus.pokedex.ui.theme.DragonColor
import br.com.mateus.pokedex.ui.theme.ElectricColor
import br.com.mateus.pokedex.ui.theme.FairyColor
import br.com.mateus.pokedex.ui.theme.FightingColor
import br.com.mateus.pokedex.ui.theme.FireColor
import br.com.mateus.pokedex.ui.theme.FlyingColor
import br.com.mateus.pokedex.ui.theme.GhostColor
import br.com.mateus.pokedex.ui.theme.GrassColor
import br.com.mateus.pokedex.ui.theme.GroundColor
import br.com.mateus.pokedex.ui.theme.IceColor
import br.com.mateus.pokedex.ui.theme.NormalColor
import br.com.mateus.pokedex.ui.theme.PoisonColor
import br.com.mateus.pokedex.ui.theme.PsychicColor
import br.com.mateus.pokedex.ui.theme.RockColor
import br.com.mateus.pokedex.ui.theme.SteelColor
import br.com.mateus.pokedex.ui.theme.WaterColor

fun backgroundColorTypePokemon(
    type: String
): Color{
    return when(type) {
        "grass" -> GrassColor
        "fire" -> FireColor
        "water" -> WaterColor
        "bug" -> BugColor
        "normal" -> NormalColor
        "poison" -> PoisonColor
        "electric" -> ElectricColor
        "ground" -> GroundColor
        "fighting" -> FightingColor
        "ghost" -> GhostColor
        "psychic" -> PsychicColor
        "rock" -> RockColor
        "steel" -> SteelColor
        "flying" -> FlyingColor
        "ice" -> IceColor
        "dragon" -> DragonColor
        "dark" -> DarkColor
        "fairy" -> FairyColor
        else -> Color.Gray
    }
}

fun parseStatColor(stat: Stat): Color {
    return when (stat.name){
        else -> Color.White
    }
}