package com.example.mfineapplication.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mfineapplication.Model.NotificationModel
import kotlinx.android.synthetic.main.notification_layout.view.*

class NotificationViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun setNotificationData(model: NotificationModel) {
        view?.apply {
            doctor_profileImage.setImageResource(model.getDoctorProfileImage())
            doctor_name.text = model.getDocterName().toString()
            notification_text.text = model.getNotificationText().toString()

        }
    }
}