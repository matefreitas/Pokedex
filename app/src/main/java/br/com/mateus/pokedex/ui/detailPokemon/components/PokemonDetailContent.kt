package br.com.mateus.pokedex.ui.detailPokemon.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mateus.pokedex.data.model.PokemonDetail
import br.com.mateus.pokedex.ui.theme.PokedexTheme

@Composable
fun DetailPokemonContent(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    pokemon: PokemonDetail
) {
    Column(
        modifier = modifier.padding(paddingValues).fillMaxSize()
    ) {
        PokemonDetailBackdropImage(
            urlImg = pokemon.spritePokemon,
            type = pokemon.types[0]
        )
        Text(
            text = pokemon.name,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        FlowRow(
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            pokemon.types.forEach {type ->
                PokemonDetailTypeTag(type = type)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        PokemonDetailWeightHeight(
            weight = pokemon.weight,
            height = pokemon.height
        )
        Spacer(modifier = Modifier.height(8.dp))
        for (stat in pokemon.stats) {
            Box(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            ){
                PokemonDetailBaseStats(
                    statName = stat.name,
                    statValue = stat.baseStat,
                    statMaxValue = pokemon.stats.maxOf { it.baseStat },
                    statColor = Color.Red
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }

}

@Preview
@Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DetailPokemonContentPreview() {
    PokedexTheme {
        Surface {
            DetailPokemonContent(
                paddingValues = PaddingValues(),
                pokemon = PokemonDetail(
                    spritePokemon = "",
                    "pikachu",
                    listOf("fire","grass"),
                    height = 0,
                    weight = 0,
                    stats = listOf()
                )
            )
        }
    }
}