package com.example.mfineapplication.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mfineapplication.Adapter.CommonSymptomsAdapter
import com.example.mfineapplication.Adapter.HospitalsAdapter
import com.example.mfineapplication.ExploreMoreActivity
import com.example.mfineapplication.Model.CommonSymptoms
import com.example.mfineapplication.Model.Hospitals
import com.example.mfineapplication.Supporter
import com.example.mfineapplication.R
import com.example.mfineapplication.WalletActivity
import kotlinx.android.synthetic.main.fragment_explore.*

class FragmentExplore : Fragment(R.layout.fragment_explore) {


    private val listOfSymptoms:ArrayList<CommonSymptoms> = ArrayList()
    private val listOfHospitals:ArrayList<Hospitals> = ArrayList()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notification_btn.setOnClickListener {
            val intent = Intent(context, Supporter::class.java)
            intent.putExtra("token", "notificationFragment")
            startActivity(intent)
        }
        wallet_btn.setOnClickListener {
            launchWallet()
        }

        btnExploreMore.setOnClickListener{
            val intent=Intent(context,ExploreMoreActivity::class.java)
            startActivity(intent)
        }


        setRecyclerViewData()
        setRecyclerView()
    }

    private fun launchWallet() {
        val intent = Intent(context, WalletActivity::class.java)
        startActivity(intent)
    }


    private fun setRecyclerViewData() {
        //for Common Symptoms
        for(i in 1..20) {
            listOfSymptoms.add(CommonSymptoms(R.drawable.diabetes_care, "COVID-19"))
        }

        //for Hospitals
        for(i in 1..20) {
            listOfHospitals.add(Hospitals(R.drawable.hospital_sparsh, "Sparsh Hospitals"))
        }
    }

    private fun setRecyclerView() {
        //for Common Symptoms
        val commonSymptomsAdapter = CommonSymptomsAdapter(listOfSymptoms)
        val gridLayoutManagerCommonSymptoms = GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false)
        recyclerViewCommonSymptoms.adapter = commonSymptomsAdapter
        recyclerViewCommonSymptoms.layoutManager = gridLayoutManagerCommonSymptoms
        recyclerViewCommonSymptoms.hasFixedSize()


        //for Hospitals
        val hospitalsAdapter = HospitalsAdapter(listOfHospitals)
        val gridLayoutManagerHospitals = GridLayoutManager(context, 1, GridLayoutManager.HORIZONTAL, false)
        recyclerViewHospitals.adapter = hospitalsAdapter
        recyclerViewHospitals.layoutManager = gridLayoutManagerHospitals
        recyclerViewHospitals.hasFixedSize()
    }

}