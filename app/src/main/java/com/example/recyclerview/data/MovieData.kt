package com.example.recyclerview.data


import com.google.gson.annotations.SerializedName

data class MovieData(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movieResults: List<MovieResults>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)