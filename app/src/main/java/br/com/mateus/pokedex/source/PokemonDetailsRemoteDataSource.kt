package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.data.model.PokemonDetail

interface PokemonDetailsRemoteDataSource {
    suspend fun getDetailPokemon(pokemonId: Long): PokemonDetail
}