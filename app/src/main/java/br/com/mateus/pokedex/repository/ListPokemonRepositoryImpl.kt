package br.com.mateus.pokedex.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.mateus.pokedex.data.model.Pokemon
import br.com.mateus.pokedex.source.ListPokemonRemoteDataSource
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class ListPokemonRepositoryImpl @Inject constructor(
    private val remoteDataSource: ListPokemonRemoteDataSource
): ListPokemonRepository {
    override fun getListPokemon(pagingConfig: PagingConfig): Flow<PagingData<Pokemon>> {
        return Pager(
            config = pagingConfig,
            pagingSourceFactory = {
                remoteDataSource.getPokedexPagingSource()
            }
        ).flow
    }
}