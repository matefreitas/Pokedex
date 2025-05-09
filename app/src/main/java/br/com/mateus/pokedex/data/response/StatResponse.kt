package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class StatResponse(
    @SerializedName("base_stat")
    val baseStat: Long,
    val effort: Long,
    val stat: StatXResponse,
)
