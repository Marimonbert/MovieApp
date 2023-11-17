package br.com.movieapp.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class SpokenLanguageResult(

    @SerializedName("english_name")
    val englishName: String,

    @SerializedName("iso_639_1")
    val iso: String,

    @SerializedName("name")
    val name: String
)