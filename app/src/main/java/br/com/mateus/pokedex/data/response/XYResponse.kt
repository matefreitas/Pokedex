package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class XYResponse(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: String?,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: String?,
)
