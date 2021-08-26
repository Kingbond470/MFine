package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mfineapplication.Fragments.FragmentExplore
import com.example.mfineapplication.Fragments.FragmentHealthFiles
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout_for_Fragments, FragmentExplore()!!).commit()

    }

    private var navigationView: NavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView = findViewById(R.id.navmenu)
        val tvBottomNav = findViewById<View>(R.id.bottomNavBar) as BottomNavigationView
        tvBottomNav.setOnNavigationItemSelectedListener(this)

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.relativeLayout, fragment).commit()
    }

    private fun launchConsultNow() {
        val intent = Intent(baseContext, ConsultNow::class.java)
        startActivity(intent)
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (menuItem.itemId) {
            R.id.nav_explore -> fragment = FragmentExplore()
            R.id.nav_consult_now -> launchConsultNow()
            R.id.nav_health_files -> fragment = FragmentHealthFiles()
        }
        fragment?.let {
            loadFragment(it)
        }
        return true
    }
}