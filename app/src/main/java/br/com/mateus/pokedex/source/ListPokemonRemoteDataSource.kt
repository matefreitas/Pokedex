package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.data.response.PokemonDetailResponse
import br.com.mateus.pokedex.data.response.PokemonResponse
import br.com.mateus.pokedex.paging.ListPokemonPagingSource

interface ListPokemonRemoteDataSource {
    fun getPokedexPagingSource(): ListPokemonPagingSource
    suspend fun getListPokemons(offset: Int,  limit: Int): PokemonResponse
    suspend fun getPokemon(name: String): PokemonDetailResponse
}