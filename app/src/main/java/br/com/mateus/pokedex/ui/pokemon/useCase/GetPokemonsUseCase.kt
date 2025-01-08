package br.com.mateus.pokedex.ui.pokemon.useCase

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.mateus.pokedex.model.ResultsPokemon
import br.com.mateus.pokedex.repository.ListPokemonRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetPokemonsUseCase {
    operator fun invoke(): Flow<PagingData<ResultsPokemon>>
}

class GetPokemonsUseCaseImpl @Inject constructor(
    private val repository: ListPokemonRepository
): GetPokemonsUseCase{
    override fun invoke(): Flow<PagingData<ResultsPokemon>> {
        return repository.getListPokemon(
            pagingConfig = PagingConfig(
                pageSize = 20,
                initialLoadSize = 20
            )
        )
    }
}