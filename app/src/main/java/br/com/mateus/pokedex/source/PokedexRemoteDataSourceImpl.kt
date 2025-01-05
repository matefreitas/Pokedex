package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.model.PokemonResponse
import br.com.mateus.pokedex.paging.PokedexPagingSource
import br.com.mateus.pokedex.service.PokedexService

class PokedexRemoteDataSourceImpl constructor(
    private val service: PokedexService
): PokedexRemoteDataSource {
    override fun getPokedexPagingSource(): PokedexPagingSource {
        return PokedexPagingSource(this)
    }

    override suspend fun getListPokemons(offset: Int, limit: Int): PokemonResponse {
        return service.getPokemons(offset = offset, limit = limit)
    }
}