package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class HeldItem(
    @SerializedName("item")
    val item: CommomData,
    @SerializedName("version_details")
    val versionDetail: List<VersionDetail>
)
