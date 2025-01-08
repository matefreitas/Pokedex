package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class Index(
    @SerializedName("game_index")
    val gameIndex: Long,
    val version: Version,
)
