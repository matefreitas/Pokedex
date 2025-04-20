package br.com.mateus.pokedex.ui.listPokemon

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun ListPokemonScreen(
    modifier: Modifier = Modifier,
    uiState: PokemonState
) {
    val pokemons = uiState.pokemons.collectAsLazyPagingItems()
    Scaffold(
        content = {paddingValues ->
            PokemonContent(
                pagingPokemons = pokemons,
                paddingValues = paddingValues
            )
        }
    )
}