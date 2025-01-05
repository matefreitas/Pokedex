package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class Move(
    @SerializedName("move")
    val move: CommomData,
    @SerializedName("version_group_details")
    val versionGroupDetail: VersionGroupDetail
)
