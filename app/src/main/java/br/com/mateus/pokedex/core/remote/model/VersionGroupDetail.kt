package br.com.mateus.pokedex.core.remote.model

import com.google.gson.annotations.SerializedName

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int,
    @SerializedName("version_group")
    val versionGroup: CommomData,
    @SerializedName("move_learn_method")
    val moveLearnMethod: CommomData
)