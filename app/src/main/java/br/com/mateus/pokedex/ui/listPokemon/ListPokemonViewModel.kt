package br.com.mateus.pokedex.ui.listPokemon

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ListPokemonViewModel @Inject constructor(
    getPokemonsUseCase: GetPokemonsUseCase
): ViewModel() {
    var uiState by mutableStateOf(PokemonState())
        private set

    init {
        val listPokemons = getPokemonsUseCase.invoke()
            .cachedIn(viewModelScope)
        uiState = uiState.copy(pokemons = listPokemons)
    }
}