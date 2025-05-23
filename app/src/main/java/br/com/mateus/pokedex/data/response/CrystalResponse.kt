package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class CrystalResponse(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_transparent")
    val backShinyTransparent: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_transparent")
    val frontShinyTransparent: String,
    @SerializedName("front_transparent")
    val frontTransparent: String,
)
