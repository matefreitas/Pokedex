package br.com.mateus.pokedex.ui.detailPokemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPokemonScreen(
    uiState: PokemonDetailsState,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Pokemon Detail")
                },
                modifier = modifier
            )
        },
        content = {paddingValues ->
            Column(
                modifier = modifier.padding(paddingValues)
            ) {
                paddingValues.toString()
                Text("detail pokemon")
                Text("teste")
            }
        }
    )
}