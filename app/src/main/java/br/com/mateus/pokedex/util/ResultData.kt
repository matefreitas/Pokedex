package br.com.mateus.pokedex.util

sealed class ResultData<out T>(){
    data object Loading: ResultData<Nothing>()
    data class Success<out T>(val data: T?): ResultData<T>()
    data class Failure(val e: Exception?): ResultData<Nothing>()
}