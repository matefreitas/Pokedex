package br.com.mateus.pokedex.ui.pokemon

import android.util.Log
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun ListPokemon(
    modifier: Modifier = Modifier,
    uiState: PokemonState
) {
    val pokemons = uiState.pokemons.collectAsLazyPagingItems()
    for ( pokemon in pokemons.itemSnapshotList){
        Log.d("item", "ListPokemon: ${pokemon?.name}")
    }
}