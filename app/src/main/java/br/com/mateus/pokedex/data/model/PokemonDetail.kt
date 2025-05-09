package br.com.mateus.pokedex.data.model

import br.com.mateus.pokedex.data.response.AbilityResponse
import br.com.mateus.pokedex.data.response.CriesResponse
import br.com.mateus.pokedex.data.response.FormResponse
import br.com.mateus.pokedex.data.response.HeldItemResponse
import br.com.mateus.pokedex.data.response.IndexResponse
import br.com.mateus.pokedex.data.response.MoveResponse
import br.com.mateus.pokedex.data.response.SpeciesResponse
import br.com.mateus.pokedex.data.response.SpritesResponse
import br.com.mateus.pokedex.data.response.StatResponse
import br.com.mateus.pokedex.data.response.TypeResponse

data class PokemonDetail(
    val abilities: List<AbilityResponse>,
    val baseExperience: Long,
    val cries: CriesResponse,
    val forms: List<FormResponse>,
    val gameIndices: List<IndexResponse>,
    val height: Long,
    val heldItems: List<HeldItemResponse>,
    val id: Long,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<MoveResponse>,
    val name: String,
    val order: Long,
    val pastAbilities: List<AbilityResponse?>,
    val pastTypes: List<TypeResponse?>,
    val species: SpeciesResponse,
    val sprites: SpritesResponse,
    val stats: List<StatResponse>,
    val types: List<TypeResponse>,
    val weight: Long
)