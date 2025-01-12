package br.com.mateus.pokedex.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import br.com.mateus.pokedex.model.Pokemon
import br.com.mateus.pokedex.model.ResultsPokemon
import br.com.mateus.pokedex.source.PokedexRemoteDataSource

class PokedexPagingSource(
    private val pokemonRemoteDataSource: PokedexRemoteDataSource
): PagingSource<Int, Pokemon>() {
    override fun getRefreshKey(state: PagingState<Int, Pokemon>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(LIMIT) ?: anchorPage?.nextKey?.minus(LIMIT)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Pokemon> {
        return try {
            val offsetNumber = params.key ?: 0

            val response = pokemonRemoteDataSource.getListPokemons(offset = offsetNumber, 20)
            val listPokemon = response.resultsPokemons
            val listPokemonResult: MutableList<Pokemon> = mutableListOf()

            listPokemon.forEach {
                val pokemonDetail = pokemonRemoteDataSource.getPokemon(it.name)
                val pokemon = Pokemon(
                    id = pokemonDetail.id,
                    nome = it.name,
                    type = pokemonDetail.types[0].type.name,
                    imgUrl = pokemonDetail.sprites.frontDefault
                )
                listPokemonResult.add(pokemon)
            }

            LoadResult.Page(
                data = listPokemonResult,
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