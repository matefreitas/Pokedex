package br.com.mateus.pokedex.di

import br.com.mateus.pokedex.BuildConfig
import br.com.mateus.pokedex.service.PokemonService
import br.com.mateus.pokedex.util.urlBaseApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val TIMEOUT = 15L

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor{
        return HttpLoggingInterceptor().apply {
            if (BuildConfig.DEBUG){
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
    }

    @Provides
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient{
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    fun provideGsonConvertorFactory(): GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Provides
    fun provideMovieService(
        client: OkHttpClient,
        converterFactory: GsonConverterFactory
    ): PokemonService{
        return Retrofit.Builder()
            .baseUrl(urlBaseApi)
            .client(client)
            .addConverterFactory(converterFactory)
            .build()
            .create()
    }
}