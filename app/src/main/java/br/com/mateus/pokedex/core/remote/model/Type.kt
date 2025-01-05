package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("slot")
    val slot: Int,
    @SerializedName("type")
    val type: CommomData
)
