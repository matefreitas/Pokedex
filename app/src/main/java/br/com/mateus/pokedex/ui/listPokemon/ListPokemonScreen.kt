package br.com.mateus.pokedex.ui.listPokemon

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun ListPokemonScreen(
    uiState: PokemonState,
    navDetailPokemon: (Long) -> Unit
) {
    val pokemons = uiState.pokemons.collectAsLazyPagingItems()
    Scaffold(
        content = {paddingValues ->
            PokemonContent(
                pagingPokemons = pokemons,
                paddingValues = paddingValues,
                navDetailPokemon = {pokemonId ->
                    navDetailPokemon(pokemonId)
                }
            )
        }
    )
}