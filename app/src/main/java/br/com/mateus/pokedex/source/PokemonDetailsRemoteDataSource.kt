package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.model.PokemonDetail
import br.com.mateus.pokedex.paging.PokemonDetailsPagingSource

interface PokemonDetailsRemoteDataSource {
    suspend fun getDetailPokemon(pokemonId: Long): PokemonDetail
}