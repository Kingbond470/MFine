package com.example.mfineapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.doctor_itemlayout.view.*
import kotlinx.android.synthetic.main.item_layout.view.*

class DoctorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(doctorModelList: DoctorModel) {
        itemView.apply {
            Glide.with(ivDoctorImage).load(doctorModelList.doctorImageUrl).into(ivDoctorImage)
            tvLocation.text = doctorModelList.location
            tvDoctorName.text = doctorModelList.doctorName
            tvSpecialization.text = doctorModelList.specialization
            tvPost.text = doctorModelList.post
            tvLanguage.text = doctorModelList.language
            tvExperience.text = doctorModelList.experience
        }
    }
}