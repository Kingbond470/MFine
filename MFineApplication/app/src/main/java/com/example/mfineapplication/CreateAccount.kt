package com.example.mfineapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*
import android.text.method.PasswordTransformationMethod

import android.text.method.HideReturnsTransformationMethod


class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

//        tvHospitalCode.setOnClickListener {
//
//            val manager = fragmentManager
//            val transaction: android.app.FragmentTransaction? = manager.beginTransaction()
//            val hospitalCode:HospitalCode = HospitalCode()
//            transaction?.replace(R.id.fragmentHospitalCode, hospitalCode, "hospitalcode")
//        }


        btnCreate.setOnClickListener {
            //val bundle = Bundle()
            val intent = Intent(baseContext, HomePage::class.java)
            startActivity(intent)
        }

        etSetPasswordCreateAccount.transformationMethod = PasswordTransformationMethod.getInstance()
        btnShowHide.setOnClickListener {
            if (etSetPasswordCreateAccount.transformationMethod == PasswordTransformationMethod.getInstance()) {
                etSetPasswordCreateAccount.transformationMethod = HideReturnsTransformationMethod.getInstance()
                btnShowHide.setBackgroundResource(R.drawable.password_show)

                //placing cursor at the end of the text
                etSetPasswordCreateAccount.setSelection(etSetPasswordCreateAccount.text.toString().length)
            } else {
                etSetPasswordCreateAccount.transformationMethod = PasswordTransformationMethod.getInstance()
                btnShowHide.setBackgroundResource(R.drawable.password_hide)

                //placing cursor at the end of the text
                etSetPasswordCreateAccount.setSelection(etSetPasswordCreateAccount.text.toString().length)
            }

        }

    }
}

