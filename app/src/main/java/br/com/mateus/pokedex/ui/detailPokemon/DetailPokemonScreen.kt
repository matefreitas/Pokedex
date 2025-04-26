package br.com.mateus.pokedex.ui.detailPokemon

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DetailPokemonScreen(modifier: Modifier = Modifier) {
    Scaffold(
        content = { paddingValues ->
            Box{
                paddingValues.toString()
                Text("detail pokemon")
            }
        }
    )
}