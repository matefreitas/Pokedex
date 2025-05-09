package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class MoveResponse(
    val move: MoveXResponse,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>,
)

