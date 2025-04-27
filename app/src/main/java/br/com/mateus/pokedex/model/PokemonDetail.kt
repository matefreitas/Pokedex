package br.com.mateus.pokedex.model

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