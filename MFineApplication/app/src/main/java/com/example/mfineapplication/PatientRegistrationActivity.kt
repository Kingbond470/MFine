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
            SetValidation()
        }
        val s = intent.getStringExtra("symptomsName")
        tvPatientSymptomsName.setText(s)
    }

    fun SetValidation(): Boolean {
        // Check for a valid name
        if (name!!.text.toString().isEmpty()) {
            nameError!!.error = resources.getString(R.string.name_error)
            isNameValid = false
        } else {
            isNameValid = true
            nameError!!.isErrorEnabled = false
        }

        // Check for a valid email address
        if (email!!.text.toString().isEmpty()) {
            emailError!!.error = resources.getString(R.string.email_error)
            isEmailValid = false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email!!.text.toString()).matches()) {
            emailError!!.error = resources.getString(R.string.error_invalid_email)
            isEmailValid = false
        } else {
            isEmailValid = true
            emailError!!.isErrorEnabled = false
        }

        // Check for a valid phone number
        if (phone!!.text.toString().isEmpty()) {
            phoneError!!.error = resources.getString(R.string.phone_error)
            isPhoneValid = false
        } else {
            isPhoneValid = true
            phoneError!!.isErrorEnabled = false
        }

        // Check for a valid password
        if (password!!.text.toString().isEmpty()) {
            passError!!.error = resources.getString(R.string.password_error)
            isPasswordValid = false
        } else if (password!!.text.length < 6) {
            passError!!.error = resources.getString(R.string.error_invalid_password)
            isPasswordValid = false
        } else {
            isPasswordValid = true
            passError!!.isErrorEnabled = false
        }
        if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid) {
            Toast.makeText(applicationContext, "Your Appointment Booked", Toast.LENGTH_SHORT).show()
            val intent1 = Intent(this,AppointmentConfirmationActivity::class.java)
            intent1.putExtra("name_value", name.text.toString())
            intent1.putExtra("emailId_value", email.text.toString())
            intent1.putExtra("mobileNo_value", phone.text.toString())
            startActivity(intent1)
        }
        return false
    }
}

