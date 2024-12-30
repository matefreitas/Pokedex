package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class CommomData(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)
