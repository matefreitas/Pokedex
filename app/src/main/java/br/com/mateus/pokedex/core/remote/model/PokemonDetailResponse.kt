package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(
    @SerializedName("abilities")
    val abilities: List<Ability>,
    @SerializedName("base_experience")
    val baseExpirence: Int,
    @SerializedName("cries")
    val cries: Crie,
    @SerializedName("forms")
    val forms: List<CommomData>,
    @SerializedName("game_indices")
    val gameIndices: List<Indice>,
    @SerializedName("height")
    val height: Int,
    @SerializedName("held_items")
    val heldItems: List<HeldItem>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String,
    @SerializedName("moves")
    val moves: List<Move>,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int,
    @SerializedName("past_types")
    val pastTypes: List<PastType>,
    @SerializedName("species")
    val species: CommomData,
    @SerializedName("sprites")
    val sprites: Sprite,
    @SerializedName("weight")
    val weight: Int
)
