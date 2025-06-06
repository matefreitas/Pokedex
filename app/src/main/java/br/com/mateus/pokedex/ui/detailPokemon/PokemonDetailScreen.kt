package br.com.mateus.pokedex.ui.detailPokemon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import br.com.mateus.pokedex.ui.detailPokemon.components.DetailPokemonContent
import br.com.mateus.pokedex.util.backgroundColorTypePokemon


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPokemonScreen(
    uiState: PokemonDetailsState,
    navigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Pokemon Detail",
                        color = Color.White
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = navigateBack,
                        colors = IconButtonDefaults.iconButtonColors(
                            contentColor = Color.White
                        )
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "",
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColorTypePokemon(uiState.pokemon?.types[0].toString())
                )
            )
        },
        content = {paddingValues ->
            uiState.pokemon?.let {
                DetailPokemonContent(
                    paddingValues = paddingValues,
                    pokemon = it
                )
            }
        }
    )
}