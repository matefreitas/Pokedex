package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorldResponse,
    val home: HomeResponse,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkResponse,
    val showdown: ShowdownResponse,
)
