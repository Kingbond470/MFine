package com.example.mfineapplication.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mfineapplication.Model.NotificationModel
import com.example.mfineapplication.OnClickListener
import kotlinx.android.synthetic.main.notification_layout.view.*

class NotificationViewHolder(private val view: View, private val onClickListener: OnClickListener) :
    RecyclerView.ViewHolder(view) {
    fun setNotificationData(model: NotificationModel) {

        view.apply {
            doctor_name.text = model.doctorName
            doctor_profileImage.setImageResource(model.doctorImage)
            notification_text.text = model.notificationText

            read_icon.setOnClickListener {
                onClickListener.readNotification(model, adapterPosition)
            }
        }
    }
}