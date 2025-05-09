package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class GenerationIiiResponse(
    val emerald: EmeraldResponse,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreenResponse,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphireResponse,
)
