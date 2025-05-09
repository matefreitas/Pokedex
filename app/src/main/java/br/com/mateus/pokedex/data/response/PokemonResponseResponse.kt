package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class PokemonResponseResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String?,
    @SerializedName("results")
    val resultsPokemons: List<ResultsPokemonResponse>
)
