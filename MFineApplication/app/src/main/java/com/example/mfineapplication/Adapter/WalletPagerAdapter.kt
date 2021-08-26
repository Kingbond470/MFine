package com.example.mfineapplication.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mfineapplication.CoinFragment
import com.example.mfineapplication.CouponFragment

class WalletPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {


    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return CouponFragment()
            1 -> return CoinFragment()
            else -> return CouponFragment()

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Coupons"
            1 -> return "Coins"

        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 2
    }
}
