package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class Crie(
    @SerializedName("latest")
    val latest: String,
    @SerializedName("legacy")
    val legacy: String
)
