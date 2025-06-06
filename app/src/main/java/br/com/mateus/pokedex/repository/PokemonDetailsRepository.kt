package br.com.mateus.pokedex.repository

import br.com.mateus.pokedex.data.model.PokemonDetail

interface PokemonDetailsRepository {
    suspend fun getPokemonDetails(pokemonId: Long): PokemonDetail
}