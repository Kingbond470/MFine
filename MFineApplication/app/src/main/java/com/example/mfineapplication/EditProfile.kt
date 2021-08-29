package com.example.mfineapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfile : AppCompatActivity() {

    private var sex:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

//        btnSave.setOnClickListener {
//            when (rgSex.checkedRadioButtonId) {
//                R.id.radioMale -> {
//                    ivProfileImage.setImageResource(R.drawable.man)
//                    displayToast("male")
//                }
//                R.id.radioFemale -> {
//                    ivProfileImage.setImageResource(R.drawable.woman)
//                    displayToast("female")
//                }
//                R.id.rbOthers -> {
//                    ivProfileImage.setImageResource(R.drawable.other)
//                    displayToast("others")
//                }
//            }
//        }

        //back button
        cdProfileBack.setOnClickListener {
                val intent= Intent(baseContext,MainActivity::class.java)
                startActivity(intent)
        }

        btnSave.setOnClickListener{
            Toast.makeText(baseContext,"Data Saved Successfully",Toast.LENGTH_SHORT).show()
            val intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }



        radioMale.setOnClickListener {
            ivProfileImage.setImageResource(R.drawable.man)
        }

        radioFemale.setOnClickListener {
            ivProfileImage.setImageResource(R.drawable.woman)
        }

        radioOthers.setOnClickListener {
            ivProfileImage.setImageResource(R.drawable.other)
        }

    }

    private fun displayToast(radio: String) {
        Toast.makeText(this, radio, Toast.LENGTH_SHORT).show()
    }

}