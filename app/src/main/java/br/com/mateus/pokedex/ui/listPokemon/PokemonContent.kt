package br.com.mateus.pokedex.ui.listPokemon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import br.com.mateus.pokedex.model.Pokemon

@Composable
fun PokemonContent(
    modifier: Modifier = Modifier,
    pagingPokemons: LazyPagingItems<Pokemon>,
    paddingValues: PaddingValues
) {
    Box{
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = paddingValues,
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxSize()
        ) {
            items(pagingPokemons.itemCount){index ->
                val pokemon: Pokemon? = pagingPokemons[index]
                pokemon?.let {
                    PokemonItem(
                        name = pokemon.nome,
                        imgPokemon = pokemon.imgUrl,
                        type = pokemon.type,

                    )
                }
            }
        }
    }
}