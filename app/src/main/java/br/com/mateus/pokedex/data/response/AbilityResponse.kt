package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class AbilityResponse(
    val ability: AbilityXResponse,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Long,
)