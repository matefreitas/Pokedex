package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.core.remote.model.PokemonResponse
import br.com.mateus.pokedex.paging.PokedexPagingSource

interface PokedexRemoteDataSource {
    fun getPokedexPagingSource(): PokedexPagingSource
    suspend fun getListPokemons(offset: Int,  limit: Int): PokemonResponse
}