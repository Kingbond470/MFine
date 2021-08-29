package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.mfineapplication.Fragments.FragmentExplore
import com.example.mfineapplication.Fragments.FragmentHealthFiles
import com.example.mfineapplication.Fragments.LabTestFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_supporter.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCurrentFragment(FragmentExplore())

        bottomNavBar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_explore -> setCurrentFragment(FragmentExplore())
                R.id.nav_consult_now -> launchConsultNow()
                R.id.nav_health_files -> setCurrentFragment(FragmentHealthFiles())

            }
            true
        }


        //on click navigation item - menu drawer
        navmenu.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.consultNow -> {
                    val intent =
                        Intent(this@MainActivity, ConsultNow::class.java)
                    startActivity(intent)
                    drawableLayout.closeDrawer(GravityCompat.START)
                }

                R.id.bookHealthPkg -> {
//                    val intent = Intent(this@MainActivity, MainActivity::class.java)
//                    startActivity(intent)
//                    drawableLayout.closeDrawer(GravityCompat.START)
                    Toast.makeText(this@MainActivity,"Consult Now | Work in Process",Toast.LENGTH_SHORT).show()

                }

                R.id.orderLabTst -> {
//                    val intent = Intent(this@MainActivity, MainActivity::class.java)
//                    startActivity(intent)
//                    drawableLayout.closeDrawer(GravityCompat.START)
                   // Toast.makeText(this@MainActivity,"Order Lab Test | Work in Process",Toast.LENGTH_SHORT).show()

                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameLayout_for_Fragments, LabTestFragment())
                            .commit()
                    }
                }

                R.id.orderMedicines -> {
                    val intent = Intent(this@MainActivity, OrderMedicineActivity::class.java)
                    startActivity(intent)
                    drawableLayout.closeDrawer(GravityCompat.START)
                }

                R.id.buySubs -> {
//                    val intent = Intent(this@MainActivity, MainActivity::class.java)
//                    startActivity(intent)
//                    drawableLayout.closeDrawer(GravityCompat.START)
                    Toast.makeText(this@MainActivity,"Subscription | Work in Process",Toast.LENGTH_SHORT).show()
                }


                // to open a new fragment which is health files
                R.id.healthFiles -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameLayout_for_Fragments, FragmentHealthFiles())
                            .commit()
                    }
                }

                R.id.Invoices -> {
                    Toast.makeText(this@MainActivity,"Invoices | Work in Process",Toast.LENGTH_SHORT).show()
                }

                R.id.helpSupport -> {
                    val intent = Intent(this@MainActivity, HelpAndSupport::class.java)
                    startActivity(intent)
                    drawableLayout.closeDrawer(GravityCompat.START)
                }

                R.id.termsConditions -> {
                    Toast.makeText(
                        applicationContext,
                        "Terms and Conditions | Work in process",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                R.id.privacyPolicy -> {
                    Toast.makeText(
                        applicationContext,
                        "Privacy Policy | Work in Process",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                R.id.setting -> {
//                    Toast.makeText(
//                        applicationContext,
//                        "Setting | Work in Process",
//                        Toast.LENGTH_SHORT
//                    ).show()
                    val intent =
                        Intent(this@MainActivity, EditProfile::class.java)
                    startActivity(intent)
                    drawableLayout.closeDrawer(GravityCompat.START)

                }


//                R.id.menu_offer -> {
//                    val intent = Intent(this@HomeActivity, Offer::class.java)
//                    startActivity(intent)
//                    drawyer.closeDrawer(GravityCompat.START)
//                }
//                R.id.menu_support -> {
//                    val intent = Intent(this@HomeActivity, Support::class.java)
//                    startActivity(intent)
//                    drawyer.closeDrawer(GravityCompat.START)
//                }
//                R.id.menu_favourite -> {
//                    val intent = Intent(this@HomeActivity, Parenting::class.java)
//                    startActivity(intent)
//                    drawyer.closeDrawer(GravityCompat.START)
//                }
//                R.id.fashion -> {
//                    val intent = Intent(this@HomeActivity, Fashion::class.java)
//                    startActivity(intent)
//                    drawyer.closeDrawer(GravityCompat.START)
//                }
//                R.id.contactUs -> {
//                    val intent = Intent(this@HomeActivity, ContactUs::class.java)
//                    startActivity(intent)
//                    drawyer.closeDrawer(GravityCompat.START)
//                }
            }
            true
        })

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout_for_Fragments, fragment)
            commit()
        }


    private fun launchConsultNow() {
        val intent = Intent(baseContext, ConsultNow::class.java)
        startActivity(intent)
    }

}