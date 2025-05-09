package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(
    val abilities: List<AbilityResponse>,
    @SerializedName("base_experience")
    val baseExperience: Long,
    val cries: CriesResponse,
    val forms: List<FormResponse>,
    @SerializedName("game_indices")
    val gameIndices: List<IndexResponse>,
    val height: Long,
    @SerializedName("held_items")
    val heldItems: List<HeldItemResponse>,
    val id: Long,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String,
    val moves: List<MoveResponse>,
    val name: String,
    val order: Long,
    @SerializedName("past_abilities")
    val pastAbilities: List<AbilityResponse?>,
    @SerializedName("past_types")
    val pastTypes: List<TypeResponse?>,
    val species: SpeciesResponse,
    val sprites: SpritesResponse,
    val stats: List<StatResponse>,
    val types: List<TypeResponse>,
    val weight: Long,
)