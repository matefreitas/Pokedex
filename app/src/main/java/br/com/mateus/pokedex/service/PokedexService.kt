package br.com.mateus.pokedex.service

import br.com.mateus.pokedex.core.remote.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PokedexService {

    @GET("pokemon/")
    suspend fun getPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): PokemonResponse
}