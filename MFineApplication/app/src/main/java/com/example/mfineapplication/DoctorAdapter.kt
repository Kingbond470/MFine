package com.example.mfineapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class DoctorAdapter(private val doctorModelList: ArrayList<DoctorModel>,var clickListener: OnClickListener) : RecyclerView.Adapter<DoctorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.doctor_itemlayout, parent, false)
        return DoctorViewHolder(view,clickListener)
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        val doctorModelList = doctorModelList[position]
        holder.setData(doctorModelList)
        ItemAnimation.animateLeftRight(holder.itemView, position)
    }

    override fun getItemCount(): Int {
        return doctorModelList.size
    }
}