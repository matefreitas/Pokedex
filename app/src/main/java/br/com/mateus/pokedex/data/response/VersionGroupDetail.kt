package br.com.mateus.pokedex.data.response

import com.google.gson.annotations.SerializedName

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Long,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethodResponse,
    @SerializedName("version_group")
    val versionGroup: VersionGroupResponse,
)
