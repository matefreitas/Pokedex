package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class GenerationViiResponse(
    val icons: IconsResponse,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoonResponse,
)
