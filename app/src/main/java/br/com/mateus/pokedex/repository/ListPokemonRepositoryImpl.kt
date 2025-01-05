package br.com.mateus.pokedex.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.mateus.pokedex.model.ResultsPokemon
import br.com.mateus.pokedex.source.PokedexRemoteDataSource
import kotlinx.coroutines.flow.Flow

class ListPokemonRepositoryImpl constructor(
    private val remoteDataSource: PokedexRemoteDataSource
): ListPokemonRepository {
    override fun getListPokemon(pagingConfig: PagingConfig): Flow<PagingData<ResultsPokemon>> {
        return Pager(
            config = pagingConfig,
            pagingSourceFactory = {
                remoteDataSource.getPokedexPagingSource()
            }
        ).flow
    }
}