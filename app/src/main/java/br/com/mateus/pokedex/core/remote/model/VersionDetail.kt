package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class VersionDetail (
    @SerializedName("rarity")
    val rarity: Int,
    @SerializedName("version")
    val version: CommomData
)