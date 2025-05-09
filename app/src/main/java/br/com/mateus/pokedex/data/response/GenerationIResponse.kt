package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class GenerationIResponse(
    @SerializedName("red-blue")
    val redBlue: RedBlueResponse,
    val yellow: YellowResponse,
)
