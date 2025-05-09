package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class HeldItemResponse(
    val item: ItemResponse,
    @SerializedName("version_details")
    val versionDetails: List<VersionDetailResponse>,
)
