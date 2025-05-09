package br.com.mateus.pokedex.ui.listPokemon

import androidx.paging.PagingData
import br.com.mateus.pokedex.data.model.Pokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class PokemonState(
    val pokemons: Flow<PagingData<Pokemon>> = emptyFlow()
)
