package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class GenerationViResponse(
    @SerializedName("omegaruby-alphasapphire")
    val omegarubyAlphasapphire: OmegarubyAlphasapphireResponse,
    @SerializedName("x-y")
    val xY: XYResponse,
)
