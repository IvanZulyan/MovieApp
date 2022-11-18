package com.ivanzulyan.andchallenge5.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class SerialResponse(
    @SerializedName("results")
    val results: List<SerialResponseItem>
)