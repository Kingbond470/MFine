package com.example.mfineapplication

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_wallet.*

class WalletActivity : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        launchCouponFragment()

        coupon_btn.setOnClickListener {
            couponButton()
        }

        coin_btn.setOnClickListener {
            buttonCoin()
        }
    }

    private fun couponButton() {
        coupon_btn.setBackgroundResource(R.drawable.coupon_tab_bg)
        coupon_btn.setTextColor(0xFFFFFFFF.toInt())
        coin_btn.setBackgroundColor(Color.TRANSPARENT)
        coin_btn.setTextColor(0xFFF4511E.toInt())
        launchCouponFragment()
    }

    private fun buttonCoin() {
        coin_btn.setBackgroundResource(R.drawable.coin_tab_bg)
        coin_btn.setTextColor(0xFFFFFFFF.toInt())
        coupon_btn.setBackgroundColor(Color.TRANSPARENT)
        coupon_btn.setTextColor(0xFFF4511E.toInt())
        launchCoinFragment()

    }

    private fun launchCouponFragment() {
        wallet_title.text = "3 Coupons Available"
        wallet_title.setTextColor(0xFF000000.toInt())
        val couponFragment = CouponFragment()
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.wallet_fragment, couponFragment, "couponFragment").commit()
    }

    private fun launchCoinFragment() {
        wallet_title.text = "11 MFine Coins Available"
        wallet_title.setTextColor(0xFFFB8C00.toInt())
        val fragmentTransaction = fragmentManager.beginTransaction()
        val coinFragment = CoinFragment()
        fragmentTransaction.replace(R.id.wallet_fragment, coinFragment).commit()


    }

    private fun removeCouponFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.remove(CouponFragment()).commit()
    }

    private fun removeCoinFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.remove(CoinFragment()).commit()
    }
}
