package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.model.PokemonDetailResponse
import br.com.mateus.pokedex.model.PokemonResponse
import br.com.mateus.pokedex.paging.ListPokemonPagingSource

interface ListPokemonRemoteDataSource {
    fun getPokedexPagingSource(): ListPokemonPagingSource
    suspend fun getListPokemons(offset: Int,  limit: Int): PokemonResponse
    suspend fun getPokemon(name: String): PokemonDetailResponse
}