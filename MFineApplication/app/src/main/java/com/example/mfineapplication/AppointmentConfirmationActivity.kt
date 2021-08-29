package com.example.mfineapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_appointment_confirmation.*

class AppointmentConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment_confirmation)

        tvPatientName.text = intent.getStringExtra("name_value")
        tvPatientContactNo.text = intent.getStringExtra("mobileNo_value")
    }
}