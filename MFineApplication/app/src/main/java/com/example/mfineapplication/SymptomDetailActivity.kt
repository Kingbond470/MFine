package com.example.mfineapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_symptom_detail.*
import java.util.ArrayList

class SymptomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptom_detail)
        val s = intent.getStringExtra("symptomsName")
        tvSymptomName.setText(s)
        browseDoctorList()
    }

    private fun browseDoctorList() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.recyclerViewDoctor)
        val doctorModels = ArrayList<DoctorModel>()
        doctorModels.add(DoctorModel("https://i.postimg.cc/zD94hqhJ/mausam.jpg", "Hyderabad","Mausam Singh","MBBS(Intern)","Physician","English,Hindi","2 years experience"))
        doctorModels.add(DoctorModel("https://i.postimg.cc/0N24vQTC/lloyd.jpg", "Bangalore","Llyod Dcosta","MBBS,DNB(General Medicine)","Physician","English","7 years experience"))
        doctorModels.add(DoctorModel("https://i.postimg.cc/L6LwBGkj/prabhakar.jpg", "Bihar","Prabhakar Kumar","MBBS(Intern)","Physician","Hindi,English","1.5 years experience"))
        doctorModels.add(DoctorModel("https://i.postimg.cc/SjFLxTJh/nrupul.jpg", "Bangalore","Nrupul Dev","MBBS,DNB(General Medicine)","Physician","English","10 years experience"))
        doctorModels.add(DoctorModel("https://i.postimg.cc/HkmKS33R/nishant.jpg", "Bihar","Nishant Rishab","MBBS(Intern)","Physician","English,Hindi","1.5 years experience"))
        doctorModels.add(DoctorModel("https://i.postimg.cc/RZTY2fDF/saikrishna.jpg", "Bangalore","Sai Krishna","MBBS","Physician","English","4 years experience"))
        doctorModels.add(DoctorModel("https://i.postimg.cc/rydvzDKn/yogesh.jpg", "Bangalore","Yogesh Bhat","MBBS,DNB(General Medicine)","Physician","English","15 years experience"))
        val doctorAdapter = DoctorAdapter(doctorModels)
        val linearLayoutManager = LinearLayoutManager(this)
        rvRecyclerView.adapter = doctorAdapter
        rvRecyclerView.layoutManager = linearLayoutManager
    }
}