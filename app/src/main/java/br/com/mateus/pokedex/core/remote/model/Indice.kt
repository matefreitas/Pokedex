package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class Indice(
    @SerializedName("game_index")
    val gameIndex: Int,
    @SerializedName("version")
    val version: CommomData
)
