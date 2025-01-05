package br.com.mateus.pokedex.ui.pokemon

import androidx.paging.PagingData
import br.com.mateus.pokedex.model.ResultsPokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class PokemonState(
    val pokemons: Flow<PagingData<ResultsPokemon>> = emptyFlow()
)
