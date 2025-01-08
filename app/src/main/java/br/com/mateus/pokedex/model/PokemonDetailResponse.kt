package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(
    val abilities: List<Ability>,
    @SerializedName("base_experience")
    val baseExperience: Long,
    val cries: Cries,
    val forms: List<Form>,
    @SerializedName("game_indices")
    val gameIndices: List<Index>,
    val height: Long,
    @SerializedName("held_items")
    val heldItems: List<HeldItem>,
    val id: Long,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Long,
    @SerializedName("past_abilities")
    val pastAbilities: List<Ability?>,
    @SerializedName("past_types")
    val pastTypes: List<Type?>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Long,
)