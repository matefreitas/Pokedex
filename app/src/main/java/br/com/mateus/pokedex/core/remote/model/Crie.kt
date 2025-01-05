package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class Crie(
    @SerializedName("latest")
    val latest: String,
    @SerializedName("legacy")
    val legacy: String
)
