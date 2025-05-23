package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.data.response.PokemonDetailResponse
import br.com.mateus.pokedex.data.response.PokemonResponseResponse
import br.com.mateus.pokedex.paging.ListPokemonPagingSource
import br.com.mateus.pokedex.service.PokedexService
import jakarta.inject.Inject

class ListPokemonRemoteDataSourceImpl @Inject constructor(
    private val service: PokedexService
): ListPokemonRemoteDataSource {
    override fun getPokedexPagingSource(): ListPokemonPagingSource {
        return ListPokemonPagingSource(this)
    }

    override suspend fun getListPokemons(offset: Int, limit: Int): PokemonResponseResponse {
        return service.getPokemons(offset = offset, limit = limit)
    }

    override suspend fun getPokemon(name: String): PokemonDetailResponse {
        return service.getPokemon(name = name)
    }
}