package com.example.mfineapplication.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mfineapplication.EditProfile
import com.example.mfineapplication.R
import kotlinx.android.synthetic.main.fragment_explore.*
import kotlinx.android.synthetic.main.fragment_health_files.*

class FragmentHealthFiles : Fragment(R.layout.fragment_health_files) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        linearEditProfile.setOnClickListener() {
            val intent = Intent(context, EditProfile::class.java)
            startActivity(intent)
        }


        ibEditProfile.setOnClickListener() {
            val intent = Intent(context, EditProfile::class.java)
            startActivity(intent)
        }


        tvConsultationHealth.setOnClickListener {
            Toast.makeText(context, "Consultation | Work in Process", Toast.LENGTH_SHORT).show()
        }

        tvHealthPrescription.setOnClickListener {
            Toast.makeText(context, "Prescription | Work in Process", Toast.LENGTH_SHORT).show()
        }
        tvAttachmentReportHealth.setOnClickListener {
            Toast.makeText(
                context,
                "Attachment and Report Health | Work in Process",
                Toast.LENGTH_SHORT
            ).show()
        }

        tvRemainderHealth.setOnClickListener {
            Toast.makeText(context, "Remainder | Work in Process", Toast.LENGTH_SHORT).show()

        }
        tvMedicalHistoryHealth.setOnClickListener {
            Toast.makeText(context, "Medical History | Work in Process", Toast.LENGTH_SHORT).show()

        }

        tvSubscriptionHealth.setOnClickListener {
            Toast.makeText(context, "Subscription | Work in Process", Toast.LENGTH_SHORT).show()

        }

        tvLabParameters.setOnClickListener {
            Toast.makeText(context, "Lab Parameters | Work in Process", Toast.LENGTH_SHORT).show()

        }

//        tvEditProfileHealth.setOnClickListener {
//            Toast.makeText(context, "Edit Profile | Work in Process", Toast.LENGTH_SHORT).show()
//
//        }
    }

}