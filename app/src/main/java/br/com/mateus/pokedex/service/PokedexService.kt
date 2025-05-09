package br.com.mateus.pokedex.service

import br.com.mateus.pokedex.data.response.PokemonDetailResponse
import br.com.mateus.pokedex.data.response.PokemonResponseResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokedexService {

    @GET("pokemon/")
    suspend fun getPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): PokemonResponseResponse

    @GET("pokemon/{name_pokemon}/")
    suspend fun getPokemon(
        @Path("name_pokemon") name: String
    ): PokemonDetailResponse

    @GET("pokemon/{id_pokemon}/")
    suspend fun getPokemonDetails(
        @Path("id_pokemon") id: Long
    ): PokemonDetailResponse
}