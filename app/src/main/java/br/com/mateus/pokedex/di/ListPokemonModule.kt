package br.com.mateus.pokedex.di

import br.com.mateus.pokedex.repository.ListPokemonRepository
import br.com.mateus.pokedex.repository.ListPokemonRepositoryImpl
import br.com.mateus.pokedex.service.PokedexService
import br.com.mateus.pokedex.source.PokedexRemoteDataSource
import br.com.mateus.pokedex.source.PokedexRemoteDataSourceImpl
import br.com.mateus.pokedex.ui.listPokemon.GetPokemonsUseCase
import br.com.mateus.pokedex.ui.listPokemon.GetPokemonsUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ListPokemonModule {

    @Provides
    @Singleton
    fun providePokedexDataSource(service: PokedexService): PokedexRemoteDataSource{
        return PokedexRemoteDataSourceImpl(service = service)
    }

    @Provides
    @Singleton
    fun provideListPokemonRepository(remoteDataSource: PokedexRemoteDataSource): ListPokemonRepository{
        return ListPokemonRepositoryImpl(remoteDataSource = remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideGetPokemonsUseCase(listPokemonRepository: ListPokemonRepository): GetPokemonsUseCase {
        return GetPokemonsUseCaseImpl(repository = listPokemonRepository)
    }
}