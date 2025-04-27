package br.com.mateus.pokedex.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import br.com.mateus.pokedex.model.PokemonDetail
import br.com.mateus.pokedex.source.PokemonDetailsRemoteDataSource

class PokemonDetailsPagingSource(
    private val remoteDataSource: PokemonDetailsRemoteDataSource,
    private val pokemonId: Long
): PagingSource<Long, PokemonDetail>() {
    override fun getRefreshKey(state: PagingState<Long, PokemonDetail>): Long? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(LIMIT) ?: anchorPage?.nextKey?.minus(LIMIT)
        }
    }

    override suspend fun load(params: LoadParams<Long>): LoadResult<Long, PokemonDetail> {
        return try {
            val response = remoteDataSource.getDetailPokemon(pokemonId)
            val result = listOf(response)
            LoadResult.Page(
                data = result,
                prevKey = null,
                nextKey = null
            )
        }catch (exception: Exception){
            return  LoadResult.Error(exception)
        }
    }

    companion object{
        private const val LIMIT = 20
    }
}