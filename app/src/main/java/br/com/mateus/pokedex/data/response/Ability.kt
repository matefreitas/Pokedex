package br.com.mateus.pokedex.data.response

import br.com.mateus.pokedex.data.response.AbilityX
import com.google.gson.annotations.SerializedName

data class Ability(
    val ability: AbilityX,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Long,
)