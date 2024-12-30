package br.com.mateus.pokedex.model

import com.google.gson.annotations.SerializedName

data class PastType(
    @SerializedName("generation")
    val generation: CommomData,
    @SerializedName("types")
    val types: List<Type>
)
