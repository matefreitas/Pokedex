package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class GenerationIvResponse(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearlResponse,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilverResponse,
    val platinum: PlatinumResponse,
)
