package com.example.mfineapplication

import com.example.mfineapplication.Model.NotificationModel

interface OnClickListener {
    fun getData(position: Int, result: DoctorModel)
    fun readNotification(notificationModel: NotificationModel, position: Int)
}