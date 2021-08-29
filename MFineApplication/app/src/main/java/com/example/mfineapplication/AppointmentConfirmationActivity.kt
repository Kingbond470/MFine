package com.example.mfineapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_appointment_confirmation.*

class AppointmentConfirmationActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment_confirmation)

        tvPatientName.text = intent.getStringExtra("name")
        tvPatientEmail.text = intent.getStringExtra("address")
        tvPatientContactNo.text = intent.getStringExtra("mobile")
        btnOk.setOnClickListener {
            Toast.makeText(this, "Your application received", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}