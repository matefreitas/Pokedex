package br.com.mateus.pokedex.repository

import br.com.mateus.pokedex.data.model.PokemonDetail
import br.com.mateus.pokedex.source.PokemonDetailsRemoteDataSource
import javax.inject.Inject

class PokemonDetailsRepositoryImpl @Inject constructor(
    private val remoteDataSource: PokemonDetailsRemoteDataSource
): PokemonDetailsRepository{
    override suspend fun getPokemonDetails(pokemonId: Long): PokemonDetail {
        return remoteDataSource.getDetailPokemon(pokemonId = pokemonId)
    }

}