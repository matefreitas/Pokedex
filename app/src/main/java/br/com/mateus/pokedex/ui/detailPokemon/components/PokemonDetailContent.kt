package br.com.mateus.pokedex.ui.detailPokemon.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mateus.pokedex.data.model.PokemonDetail

@Composable
fun DetailPokemonContent(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    pokemon: PokemonDetail
) {
    Column(
        modifier = modifier.padding(paddingValues)
    ) {
        PokemonDetailBackdropImage(
            urlImg = pokemon.sprites.frontDefault,
            type = pokemon.types[0].type.name
        )
        Text(
            pokemon.name,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        )
    }

}

/*@Preview
@Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DetailPokemonContentPreview() {
    PokedexTheme {
        Surface {
            DetailPokemonContent(
                paddingValues = PaddingValues(),
                pokemon = PokemonDetail(
                    abilities = listOf(),
                    baseExperience = 0,
                    cries = Cries("",""),
                    forms = listOf(),
                    gameIndices = listOf(),
                    height = 0,
                    heldItems = listOf(),
                    id = 0,
                    isDefault = false,
                    locationAreaEncounters = "",
                    moves = listOf(),
                    name = "",
                    order = 0,
                    pastAbilities = listOf(),
                    pastTypes = listOf(),
                    species = Species("",""),
                    sprites = Sprites(
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        Other(
                            DreamWorld("",""),
                            Home("","","",""),
                            OfficialArtwork("",""),
                            Showdown("","","","","","","","")
                        ),
                    ),
                    stats = listOf(),
                    types = listOf(),
                    weight = 0
                )
            )
        }
    }
}*/