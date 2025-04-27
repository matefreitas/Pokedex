package br.com.mateus.pokedex.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import br.com.mateus.pokedex.ui.detailPokemon.DetailPokemonScreen
import br.com.mateus.pokedex.ui.detailPokemon.DetailPokemonViewModel
import br.com.mateus.pokedex.ui.listPokemon.ListPokemonScreen
import br.com.mateus.pokedex.ui.listPokemon.ListPokemonViewModel
import br.com.mateus.pokedex.util.DETAIL_POKEMON_ARGUMENT_KEY


@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screens.Home.route
    ){
        composable(Screens.Home.route){
            val uiState: ListPokemonViewModel = hiltViewModel()
            ListPokemonScreen(
                uiState = uiState.uiState,
                navDetailPokemon = {
                    navHostController.navigate(Screens.Detail.passPokemonId(id = it))
                }
            )
        }
        composable(
            route = Screens.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_POKEMON_ARGUMENT_KEY) {
                    type = NavType.LongType
                    defaultValue = 0
                }
            )
        ) {
            val uiState: DetailPokemonViewModel = hiltViewModel()
            DetailPokemonScreen(
                uiState = uiState.uiState
            )
        }
    }
}