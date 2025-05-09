package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class DreamWorldResponse(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: String?,
)
