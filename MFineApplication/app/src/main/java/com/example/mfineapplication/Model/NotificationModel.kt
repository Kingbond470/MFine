package com.example.mfineapplication.Model

import com.google.gson.annotations.SerializedName

data class NotificationModel(
    @SerializedName("doctorImage")
    val doctorImage: String,
    @SerializedName("doctorName")
    val doctorName: String,
    @SerializedName("notificationText")
    val notificationText: String

)

