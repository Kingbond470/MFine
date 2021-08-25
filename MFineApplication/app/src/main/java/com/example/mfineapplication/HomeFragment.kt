package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notification_btn.setOnClickListener {
            val intent = Intent(context, HomeActivity::class.java)
            intent.putExtra("token", "notificationFragment")
            startActivity(intent)
        }
        wallet_btn.setOnClickListener {
            launchWallet()
        }
    }
    private fun launchWallet() {
        val intent = Intent(context, WalletActivity::class.java)
        startActivity(intent)
    }
}