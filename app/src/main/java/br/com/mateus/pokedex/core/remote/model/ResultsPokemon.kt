package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class ResultsPokemon(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)
