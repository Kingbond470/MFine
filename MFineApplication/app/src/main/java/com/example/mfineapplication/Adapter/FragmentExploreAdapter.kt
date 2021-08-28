package com.example.mfineapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mfineapplication.Model.CommonSymptoms
import com.example.mfineapplication.Model.Hospitals
import com.example.mfineapplication.R
import kotlinx.android.synthetic.main.item_layout_common_symptoms.view.*
import kotlinx.android.synthetic.main.item_layout_hospitals.view.*


//Adapter for Common Symptoms
class CommonSymptomsAdapter(private val listOfSymptoms:ArrayList<CommonSymptoms>): RecyclerView.Adapter<CommonSymptomsAdapter.CommonSymptomsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonSymptomsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_common_symptoms, parent, false)
        return CommonSymptomsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommonSymptomsViewHolder, position: Int) {
        val commonSymptoms = listOfSymptoms[position]
        holder.setData(commonSymptoms)
    }

    override fun getItemCount(): Int {
        return listOfSymptoms.size
    }


    //ViewHolder for Common Symptoms
    class CommonSymptomsViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {
        internal fun setData(commonSymptoms: CommonSymptoms) {
            view.apply {
                Glide.with(ivSymptomsImage).load(commonSymptoms.symptomImage).into(ivSymptomsImage)
                tvSymptomName.text = commonSymptoms.symptomTitle
            }
        }
    }

}




//Adapter for Hospitals
class HospitalsAdapter(private val listOfHospitals:ArrayList<Hospitals>): RecyclerView.Adapter<HospitalsAdapter.HospitalsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_hospitals, parent, false)
        return HospitalsViewHolder(view)
    }

    override fun onBindViewHolder(holder: HospitalsViewHolder, position: Int) {
        val hospitals = listOfHospitals[position]
        holder.setData(hospitals)
    }

    override fun getItemCount(): Int {
        return listOfHospitals.size
    }


    //ViewHolder for Hospitals
    class HospitalsViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {
        internal fun setData(hospitals: Hospitals) {
            view.apply {
                Glide.with(ivHospitalImage).load(hospitals.hospitalImage).into(ivHospitalImage)
                tvHospitalName.text = hospitals.hospitalName
            }
        }
    }

}
