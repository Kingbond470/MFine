package com.example.mfineapplication

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    var navigationView: NavigationView? = null
    var fragmentManager: FragmentManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager
        navigationView = findViewById(R.id.navmenu)
        val tvBottomNav = findViewById<View>(R.id.bottomNavigation) as BottomNavigationView
        tvBottomNav.setOnNavigationItemSelectedListener(this)
        loadFragment(ExploreFragment())
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.relativeLayout, fragment).commit()
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (menuItem.itemId) {
            R.id.home -> fragment = ExploreFragment()
            R.id.category -> fragment = ConsultNowFragment()
            R.id.setting -> fragment = HealthFilesFragment()
        }
        fragment?.let {
            loadFragment(it) }
        return true
    }
}