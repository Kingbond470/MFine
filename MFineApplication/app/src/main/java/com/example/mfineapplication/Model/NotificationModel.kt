package com.example.mfineapplication.Model

 class NotificationModel (doctorProfileImage: Int, docterName: String?, notificationText: String?){
    private var doctorProfileImage = 0
    private var docterName: String? = null
    private var notificationText: String? = null

    fun NotificationModel(doctorProfileImage: Int, docterName: String?, notificationText: String?) {
        this.doctorProfileImage = doctorProfileImage
        this.docterName = docterName
        this.notificationText = notificationText
    }

    fun getDoctorProfileImage(): Int {
        return doctorProfileImage
    }

    fun getDocterName(): String? {
        return docterName
    }

    fun getNotificationText(): String? {
        return notificationText
    }


}

