package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class OfficialArtworkSprite(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)
