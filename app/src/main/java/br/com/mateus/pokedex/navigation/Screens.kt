package br.com.mateus.pokedex.navigation

import br.com.mateus.pokedex.util.DETAIL_POKEMON_ARGUMENT_KEY

sealed class Screens(val route: String) {
    object Home: Screens(route = "list_pokemon")
    object Detail: Screens(route = "detail_pokemon_destination?${DETAIL_POKEMON_ARGUMENT_KEY}="
            + "{$DETAIL_POKEMON_ARGUMENT_KEY}"
    ){
        fun passPokemonId(id: Long)=
            "detail_pokemon_destination?${DETAIL_POKEMON_ARGUMENT_KEY}=$id"
    }
}