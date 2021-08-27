package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mfineapplication.Adapter.NotificationAdapter
import com.example.mfineapplication.Model.NotificationModel
import kotlinx.android.synthetic.main.fragment_notification.*

class NotificationFragment : Fragment(R.layout.fragment_notification) {
    private var doctorList = arrayListOf<NotificationModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buildNotificationList()
        setNotificationRecyclerView()
        backToHome.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buildNotificationList() {
        doctorList = arrayListOf()
        for (i in 0..10) {
            doctorList.add(
                NotificationModel(
                    R.drawable.user_icon,
                    "Dr.Twinkle",
                    "wants to know your fever condition, if you have any query then he will resolve"
                )
            )
            doctorList.add(
                NotificationModel(
                    R.drawable.user_icon, "Dr.Mausham",
                    "wants to know your head pain"
                )
            )
            doctorList.add(
                NotificationModel(
                    R.drawable.user_icon,
                    "Dr.Nishant",
                    "wants to know health click heer to conversession"
                )
            )
        }
    }

    private fun setNotificationRecyclerView() {
        val notificationAdapter = NotificationAdapter(doctorList)
        notification_recyclerView.layoutManager = LinearLayoutManager(context)
        notification_recyclerView.adapter = notificationAdapter
    }
}