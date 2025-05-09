package br.com.mateus.pokedex.source

import br.com.mateus.pokedex.data.model.PokemonDetail
import br.com.mateus.pokedex.service.PokedexService
import javax.inject.Inject

class PokemonDetailsRemoteDataSourceImpl @Inject constructor(
    private val service: PokedexService
): PokemonDetailsRemoteDataSource {

    override suspend fun getDetailPokemon(pokemonId: Long): PokemonDetail {
        val response = service.getPokemonDetails(pokemonId)
        return PokemonDetail(
            id = response.id,
            name = response.name,
            forms = response.forms,
            cries = response.cries,
            moves = response.moves,
            order = response.order,
            stats = response.stats,
            types = response.types,
            height = response.height,
            weight = response.weight,
            species = response.species,
            sprites = response.sprites,
            abilities = response.abilities,
            heldItems = response.heldItems,
            isDefault = response.isDefault,
            pastTypes = response.pastTypes,
            gameIndices = response.gameIndices,
            pastAbilities = response.pastAbilities,
            baseExperience = response.baseExperience,
            locationAreaEncounters = response.locationAreaEncounters
        )
    }


}