package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i")
    val generationI: GenerationIResponse,
    @SerializedName("generation-ii")
    val generationIi: GenerationIiResponse,
    @SerializedName("generation-iii")
    val generationIii: GenerationIiiResponse,
    @SerializedName("generation-iv")
    val generationIv: GenerationIvResponse,
    @SerializedName("generation-v")
    val generationV: GenerationVResponse,
    @SerializedName("generation-vi")
    val generationVi: GenerationViResponse,
    @SerializedName("generation-vii")
    val generationVii: GenerationViiResponse,
    @SerializedName("generation-viii")
    val generationViii: GenerationViiiResponse,
)
