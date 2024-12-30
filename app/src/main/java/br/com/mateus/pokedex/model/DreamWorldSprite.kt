package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class DreamWorldSprite(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: String?
)
