package com.example.mfineapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mfineapplication.Fragments.FragmentExplore
import com.example.mfineapplication.Fragments.FragmentHealthFiles
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout_for_Fragments, FragmentExplore()!!).commit()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        bottomNavBar.setOnNavigationItemSelectedListener(navigationListener)


    }

    private fun launchConsultNow() {
        val intent = Intent(baseContext, ConsultNow::class.java)
        startActivity(intent)
    }

    private val navigationListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_explore -> selectedFragment = FragmentExplore()
                R.id.nav_consult_now -> launchConsultNow()
                R.id.nav_health_files -> selectedFragment = FragmentHealthFiles()
            }
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout_for_Fragments, selectedFragment!!).commit()
            true
        }


}