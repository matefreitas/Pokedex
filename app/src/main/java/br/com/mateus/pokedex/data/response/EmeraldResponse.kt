package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class EmeraldResponse(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String,
)
