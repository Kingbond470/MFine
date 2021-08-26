package com.example.mfineapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Supporter : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    private val fragmentTransaction = fragmentManager.beginTransaction()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supporter)
        if (intent?.getStringExtra("token").equals("notificationFragment")) {
            launchNotificationFragment()
        }
//                else {
//            launchHomeFragment()
//        }
    }

//    private fun launchHomeFragment() {
//        val homeFragment = HomeFragment()
//        fragmentTransaction.add(R.id.fragment, homeFragment, "").commit()
//    }

    private fun launchNotificationFragment() {
        val notificationFragment = NotificationFragment()
        fragmentTransaction.add(R.id.fragment, notificationFragment, "notificationFragment")
            .commit()
    }

}