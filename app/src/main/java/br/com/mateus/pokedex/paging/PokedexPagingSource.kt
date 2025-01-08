package br.com.mateus.pokedex.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import br.com.mateus.pokedex.model.ResultsPokemon
import br.com.mateus.pokedex.source.PokedexRemoteDataSource

class PokedexPagingSource(
    private val pokemonRemoteDataSource: PokedexRemoteDataSource
): PagingSource<Int, ResultsPokemon>() {
    override fun getRefreshKey(state: PagingState<Int, ResultsPokemon>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(LIMIT) ?: anchorPage?.nextKey?.minus(LIMIT)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResultsPokemon> {
        return try {
            val offsetNumber = params.key ?: 0

            val response = pokemonRemoteDataSource.getListPokemons(offset = offsetNumber, 20)
            val listPokemon = response.resultsPokemons

            listPokemon.forEach {
                val pokemonDetail = pokemonRemoteDataSource.getPokemon(it.name)
                Log.d("nomePokemon", "load: ${pokemonDetail.sprites.frontDefault}")
            }

            LoadResult.Page(
                data = listPokemon,
                prevKey = if (offsetNumber == 0) null else offsetNumber - 20,
                nextKey = if (listPokemon.isEmpty()) null else offsetNumber + 20
            )
        }catch (exception: Exception){
            return  LoadResult.Error(exception)
        }
    }

    companion object{
        private const val LIMIT = 20
    }
}