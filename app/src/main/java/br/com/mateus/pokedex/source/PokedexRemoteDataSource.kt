package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.model.PokemonDetailResponse
import br.com.mateus.pokedex.model.PokemonResponse
import br.com.mateus.pokedex.paging.PokedexPagingSource

interface PokedexRemoteDataSource {
    fun getPokedexPagingSource(): PokedexPagingSource
    suspend fun getListPokemons(offset: Int,  limit: Int): PokemonResponse
    suspend fun getPokemon(name: String): PokemonDetailResponse
}