package br.com.mateus.pokedex.di

import br.com.mateus.pokedex.repository.PokemonDetailsRepository
import br.com.mateus.pokedex.repository.PokemonDetailsRepositoryImpl
import br.com.mateus.pokedex.service.PokedexService
import br.com.mateus.pokedex.source.PokemonDetailsRemoteDataSource
import br.com.mateus.pokedex.source.PokemonDetailsRemoteDataSourceImpl
import br.com.mateus.pokedex.ui.detailPokemon.GetPokemonDetailsUseCase
import br.com.mateus.pokedex.ui.detailPokemon.GetPokemonDetailsUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokemonDetailsModule {

    @Provides
    @Singleton
    fun providePokemonDetailsDataSource(service: PokedexService): PokemonDetailsRemoteDataSource{
        return PokemonDetailsRemoteDataSourceImpl(service = service)
    }

    @Provides
    @Singleton
    fun providePokemonDetailsRepository(remoteDataSource: PokemonDetailsRemoteDataSource): PokemonDetailsRepository{
        return PokemonDetailsRepositoryImpl(remoteDataSource = remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideGetPokemonDetailsUseCase(repository: PokemonDetailsRepository): GetPokemonDetailsUseCase{
        return GetPokemonDetailsUseCaseImpl(repository = repository)
    }
}