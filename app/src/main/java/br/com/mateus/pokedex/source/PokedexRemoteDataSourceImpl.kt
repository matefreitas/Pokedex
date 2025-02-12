package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.model.PokemonDetailResponse
import br.com.mateus.pokedex.model.PokemonResponse
import br.com.mateus.pokedex.paging.PokedexPagingSource
import br.com.mateus.pokedex.service.PokedexService
import jakarta.inject.Inject

class PokedexRemoteDataSourceImpl @Inject constructor(
    private val service: PokedexService
): PokedexRemoteDataSource {
    override fun getPokedexPagingSource(): PokedexPagingSource {
        return PokedexPagingSource(this)
    }

    override suspend fun getListPokemons(offset: Int, limit: Int): PokemonResponse {
        return service.getPokemons(offset = offset, limit = limit)
    }

    override suspend fun getPokemon(name: String): PokemonDetailResponse {
        return service.getPokemon(name = name)
    }
}