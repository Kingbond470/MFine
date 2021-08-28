package com.example.mfineapplication.Model

import com.google.gson.annotations.SerializedName

data class ExploreCategoryModel(
    @SerializedName("categoryImage")
    val categoryImage: Int,
    @SerializedName("categoryName")
    val categoryName: String,
    @SerializedName("categoryDescription")
    val categoryDescription: String
)