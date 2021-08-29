package com.example.mfineapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mfineapplication.ItemAnimation
import com.example.mfineapplication.Model.NotificationModel
import com.example.mfineapplication.R
import com.example.mfineapplication.ViewHolder.NotificationViewHolder

class NotificationAdapter(private val notificationList: List<NotificationModel>) :
    RecyclerView.Adapter<NotificationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.notification_layout, parent, false)
        return NotificationViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val model: NotificationModel = notificationList[position]
        ItemAnimation.animateLeftRight(holder.itemView, position)
        holder.setNotificationData(model)
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

}