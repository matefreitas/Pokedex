package br.com.mateus.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import br.com.mateus.pokedex.ui.listPokemon.ListPokemonScreen
import br.com.mateus.pokedex.ui.listPokemon.ListPokemonViewModel
import br.com.mateus.pokedex.ui.theme.PokedexTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                val uiState: ListPokemonViewModel = hiltViewModel()
                ListPokemonScreen(
                    Modifier,
                    uiState.uiState
                )
            }
        }
    }
}