package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.data.model.PokemonDetail
import br.com.mateus.pokedex.service.PokedexService
import javax.inject.Inject

class PokemonDetailsRemoteDataSourceImpl @Inject constructor(
    private val service: PokedexService
) : PokemonDetailsRemoteDataSource {

    override suspend fun getDetailPokemon(pokemonId: Long): PokemonDetail {
        val response = service.getPokemonDetails(pokemonId)
        val listTypes: MutableList<String> = mutableListOf()
        response.types.forEach {
            listTypes.add(it.type.name)
        }

        return PokemonDetail(
            spritePokemon = response.sprites.frontDefault,
            name = response.name,
            types = listTypes,
            height = response.height,
            weight = response.weight
        )
    }
}