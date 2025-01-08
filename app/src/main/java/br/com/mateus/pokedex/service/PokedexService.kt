package br.com.mateus.pokedex.service

import br.com.mateus.pokedex.model.PokemonDetailResponse
import br.com.mateus.pokedex.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokedexService {

    @GET("pokemon/")
    suspend fun getPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): PokemonResponse

    @GET("pokemon/{name_pokemon}/")
    suspend fun getPokemon(
        @Path("name_pokemon") name: String
    ): PokemonDetailResponse
}