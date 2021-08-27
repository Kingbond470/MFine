package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mfineapplication.Fragments.FragmentExplore
import com.example.mfineapplication.Fragments.FragmentHealthFiles
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCurrentFragment(FragmentExplore())

        bottomNavBar.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_explore->setCurrentFragment(FragmentExplore())
                R.id.nav_consult_now->launchConsultNow()
                R.id.nav_health_files->setCurrentFragment(FragmentHealthFiles())

            }
            true
        }

    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout_for_Fragments,fragment)
            commit()
        }


    private fun launchConsultNow() {
        val intent = Intent(baseContext, ConsultNow::class.java)
        startActivity(intent)
    }

}