package br.com.mateus.pokedex.ui.detailPokemon.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mateus.pokedex.util.FunctionUtil

@Composable
fun PokemonDetailTypeTag(
    type: String
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(100.dp))
            .background(FunctionUtil.backgroundColorTypePokemon(type))
            .height(50.dp)
            .width(150.dp)
    ){
        Text(
            text = type,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Preview
@Composable
private fun PokemonDetailTypeTagPrev() {
    PokemonDetailTypeTag(
        type = "fire"
    )
}