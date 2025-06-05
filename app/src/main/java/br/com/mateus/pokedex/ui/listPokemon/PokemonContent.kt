package br.com.mateus.pokedex.ui.listPokemon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import br.com.mateus.pokedex.data.model.Pokemon
import br.com.mateus.pokedex.ui.commom.ErrorScreen
import br.com.mateus.pokedex.ui.commom.LoadingView

@Composable
fun PokemonContent(
    modifier: Modifier = Modifier,
    pagingPokemons: LazyPagingItems<Pokemon>,
    paddingValues: PaddingValues,
    navDetailPokemon: (pokemonId: Long) -> Unit
) {
    Box{
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = paddingValues,
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxSize()
        ) {
            items(pagingPokemons.itemCount){index ->
                val pokemon: Pokemon? = pagingPokemons[index]
                pokemon?.let {
                    PokemonItem(
                        name = pokemon.nome,
                        imgPokemon = pokemon.imgUrl,
                        type = pokemon.type,
                        id = pokemon.id,
                        onclick = {pokemonId ->
                            navDetailPokemon(pokemonId)
                        }
                    )
                }
            }
            pagingPokemons.apply {
                when{
                    loadState.refresh is LoadState.Loading -> {
                        item(
                            span = {
                                GridItemSpan(maxLineSpan)
                            }
                        ){
                            LoadingView()
                        }
                    }
                    loadState.append is LoadState.Loading -> {
                        item(
                            span = {
                                GridItemSpan(maxLineSpan)
                            }
                        ){
                            LoadingView()
                        }
                    }
                    loadState.refresh is LoadState.Error -> {
                        item(
                            span = {
                                GridItemSpan(maxLineSpan)
                            }
                        ){
                            ErrorScreen(
                                message = "Verifique sua conexão com a internet",
                                retry = {
                                    retry()
                                }
                            )
                        }
                    }
                    loadState.append is LoadState.Error -> {
                        item(
                            span = {
                                GridItemSpan(maxLineSpan)
                            }
                        ){
                            ErrorScreen(
                                message = "Verifique sua conexão com a internet",
                                retry = {
                                    retry()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}