package br.com.mateus.pokedex.ui.detailPokemon

import br.com.mateus.pokedex.data.model.PokemonDetail
import br.com.mateus.pokedex.repository.PokemonDetailsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface GetPokemonDetailsUseCase{
    suspend operator fun invoke(params: Params): PokemonDetail

    data class Params(val pokemonId: Long)
}

class GetPokemonDetailsUseCaseImpl @Inject constructor(
    private val repository: PokemonDetailsRepository
): GetPokemonDetailsUseCase {
    override suspend fun invoke(params: GetPokemonDetailsUseCase.Params): PokemonDetail {
        return withContext(Dispatchers.IO){
            repository.getPokemonDetails(params.pokemonId)
        }
    }
}