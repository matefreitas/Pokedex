package br.com.mateus.pokedex.data.model

import br.com.mateus.pokedex.data.response.Ability
import br.com.mateus.pokedex.data.response.Cries
import br.com.mateus.pokedex.data.response.Form
import br.com.mateus.pokedex.data.response.HeldItem
import br.com.mateus.pokedex.data.response.Index
import br.com.mateus.pokedex.data.response.Move
import br.com.mateus.pokedex.data.response.Species
import br.com.mateus.pokedex.data.response.Sprites
import br.com.mateus.pokedex.data.response.Stat
import br.com.mateus.pokedex.data.response.Type

data class PokemonDetail(
    val abilities: List<Ability>,
    val baseExperience: Long,
    val cries: Cries,
    val forms: List<Form>,
    val gameIndices: List<Index>,
    val height: Long,
    val heldItems: List<HeldItem>,
    val id: Long,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Long,
    val pastAbilities: List<Ability?>,
    val pastTypes: List<Type?>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Long
)