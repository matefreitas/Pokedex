package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class GenerationVResponse(
    @SerializedName("black-white")
    val blackWhite: BlackWhite,
)
