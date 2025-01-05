package br.com.mateus.pokedex.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.mateus.pokedex.core.remote.model.ResultsPokemon
import kotlinx.coroutines.flow.Flow

interface ListPokemonRepository {
    fun getListPokemon(pagingConfig: PagingConfig): Flow<PagingData<ResultsPokemon>>
}