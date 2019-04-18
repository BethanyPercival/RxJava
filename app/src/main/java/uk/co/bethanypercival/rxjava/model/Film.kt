package uk.co.onthebeach.rxjava.model

import com.google.gson.annotations.SerializedName

data class Film(val title: String,
                @SerializedName("release_date")
                val releaseDate: String,
                val url: String)
