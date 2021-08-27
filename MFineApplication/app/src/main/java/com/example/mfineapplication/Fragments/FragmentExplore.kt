package com.example.mfineapplication.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mfineapplication.ExploreMoreActivity
import com.example.mfineapplication.Supporter
import com.example.mfineapplication.R
import com.example.mfineapplication.WalletActivity
import kotlinx.android.synthetic.main.fragment_explore.*

class FragmentExplore : Fragment(R.layout.fragment_explore) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ivNotificationIcon.setOnClickListener {
            val intent = Intent(context, Supporter::class.java)
            intent.putExtra("token", "notificationFragment")
            startActivity(intent)
        }
        ivWalletIcon.setOnClickListener {
            launchWallet()
        }

        btnExploreMore.setOnClickListener{
            val intent=Intent(context,ExploreMoreActivity::class.java)
            startActivity(intent)
        }
    }

    private fun launchWallet() {
        val intent = Intent(context, WalletActivity::class.java)
        startActivity(intent)
    }

}