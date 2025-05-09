package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class ResultsPokemonResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)
