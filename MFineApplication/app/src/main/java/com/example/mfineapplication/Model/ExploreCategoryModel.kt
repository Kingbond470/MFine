package com.example.mfineapplication.Model

import com.google.gson.annotations.SerializedName

data class ExploreCategoryModel(
    @SerializedName("categoryImage")
    val categoryImage: String,
    @SerializedName("categoryName")
    val categoryName: String,
    @SerializedName("categoryDescription")
    val categoryDescription: String
)