package com.example.mfineapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mfineapplication.Adapter.NotificationAdapter
import com.example.mfineapplication.Model.NotificationModel
import kotlinx.android.synthetic.main.fragment_notification.*

class NotificationFragment : Fragment(R.layout.fragment_notification) {
    private lateinit var doctorList: List<NotificationModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buildList()
        setNotificationRecyclerView()
    }

    private fun buildList() {
        doctorList = arrayListOf()
        for (i in 0..10) {
            (doctorList as ArrayList<NotificationModel>).add(
                NotificationModel(
                    R.drawable.user_icon, "Dr.Twinkle",
                    "wants to know your fever condition, if you have any query then he will resolve"
                )
            )

            (doctorList as ArrayList<NotificationModel>).add(
                NotificationModel(
                    R.drawable.user_icon, "Dr.Mausham",
                    "wants to know your head pain"
                )
            )
            (doctorList as ArrayList<NotificationModel>).add(
                NotificationModel(
                    R.drawable.user_icon, "Dr.Nishant",
                    "wants to know health click heer to converssion"
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