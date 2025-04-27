package br.com.mateus.pokedex.ui.detailPokemon

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.mateus.pokedex.util.DETAIL_POKEMON_ARGUMENT_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailPokemonViewModel @Inject constructor(
    getPokemonDetailsUseCase: GetPokemonDetailsUseCase,
    savedStateHandle: SavedStateHandle
): ViewModel() {
    var uiState by mutableStateOf(PokemonDetailsState())
        private set

    private val pokemonId = savedStateHandle.get<Long>(key = DETAIL_POKEMON_ARGUMENT_KEY)

    init {
        pokemonId?.let { id ->
            viewModelScope.launch {
                val resultData = getPokemonDetailsUseCase.invoke(
                    params = GetPokemonDetailsUseCase.Params(pokemonId = id)
                )
                Log.d("result", "Resultado consulta: $resultData")
            }
        }
    }
}