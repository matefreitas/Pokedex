package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorldSprite,
    @SerializedName("home")
    val home: HomeSprite,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkSprite,
    @SerializedName("showdown")
    val showdown: ShowdownSprite
)
