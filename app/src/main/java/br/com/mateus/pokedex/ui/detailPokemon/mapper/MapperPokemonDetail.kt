package br.com.mateus.pokedex.ui.detailPokemon.mapper

import br.com.mateus.pokedex.data.model.Stat
import br.com.mateus.pokedex.data.response.StatResponse

fun List<StatResponse>.toPokemonStat() = map { stat ->
    Stat(
        baseStat = stat.baseStat,
        effort = stat.effort,
        name = stat.stat.name
    )
}