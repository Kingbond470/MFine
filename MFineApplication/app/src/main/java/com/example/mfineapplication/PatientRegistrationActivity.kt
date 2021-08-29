package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_patient_registration.*
import kotlinx.android.synthetic.main.activity_symptom_detail.*

class PatientRegistrationActivity : AppCompatActivity() {
    var isNameValid = false
    var isEmailValid = false
    var isPhoneValid = false
    var isPasswordValid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_registration)
        register?.setOnClickListener {
            launchConfirmation()
        }
    }

//    private fun SetValidation(): Boolean {
//        // Check for a valid name
//        if (name?.text.toString().isEmpty()) {
//            name.error = "Enter name"
//            isNameValid = false
//        } else {
//            isNameValid = true
//           name.isEnabled = false
//        }
//
//
//        // Check for a valid phone number
//        if (phone?.text.toString().isEmpty()) {
//            phone.error = "Enter Phone"
//            isPhoneValid = false
//        } else {
//            isPhoneValid = true
//            phone.isEnabled = false
//        }
//
//        // Check for a valid password
//        if (address?.text.toString().isEmpty()) {
//            address.error = "Enter address"
//            isPasswordValid = false
//        } else {
//            isPasswordValid = true
//            address.isEnabled = false
//        }
//
//        return false
//    }
    private fun launchConfirmation(){
                Toast.makeText(applicationContext, "Your Appointment Booked", Toast.LENGTH_SHORT).show()
                val intent1 = Intent(this,AppointmentConfirmationActivity::class.java)
                intent1.putExtra("name", etAppointName.text.toString())
                intent1.putExtra("address", etAppointAddress.text.toString())
                intent1.putExtra("mobile", etAppointNumber.text.toString())
                startActivity(intent1)
    }
}

