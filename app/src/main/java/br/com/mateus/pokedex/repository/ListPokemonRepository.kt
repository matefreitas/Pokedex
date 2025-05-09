package br.com.mateus.pokedex.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.mateus.pokedex.data.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface ListPokemonRepository {
    fun getListPokemon(pagingConfig: PagingConfig): Flow<PagingData<Pokemon>>
}