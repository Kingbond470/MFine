package com.example.mfineapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ConsultNow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consult_now)
        browseHeartRelatedProblems()
        browseSurgeryRelatedIssue()
        browseMentalHealthIssue()
    }

    private fun browseHeartRelatedProblems() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvHeartRelatedProblems)
        val symptomsModels = ArrayList<SymptomsModel>()
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/cCGtLgzZ/chestpain.jpg", "Chest Pain"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/yYBSqR9y/legswelling.jpg", "Leg Swelling"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/cHn8WMXX/giddiness.jpg", "Giddiness"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/VkKtWNJB/palpitation.jpg", "Palpitation"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/Y0NGG2cF/other.jpg", "Other"))
        val symptomsAdapter = SymptomsAdapter(symptomsModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = symptomsAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun browseSurgeryRelatedIssue() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvSurgeryRelatedIssues)
        val symptomsModels = ArrayList<SymptomsModel>()
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/yYBSqR9y/legswelling.jpg", "Hernia"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/yYBSqR9y/legswelling.jpg", "Varicose veins"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/yYBSqR9y/legswelling.jpg", "Ulcer"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/Sxx2RpgX/swelling.jpg", "Swelling"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/Y0NGG2cF/other.jpg", "Other"))
        val heartRelatedAdapter = SymptomsAdapter(symptomsModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = heartRelatedAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun browseMentalHealthIssue() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvSurgeryRelatedIssues)
        val symptomsModels = ArrayList<SymptomsModel>()
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/3w6DzbCk/depression.jpg", "Depression"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/bvdtCjbX/anxiety.jpg", "Anxiety"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/Wp0Jf8D4/obsessive.jpg", "Obsessive"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/02fK9N0R/stress.jpg", "Stress"))
        symptomsModels.add(SymptomsModel("https://i.postimg.cc/Y0NGG2cF/other.jpg", "Other"))
        val heartRelatedAdapter = SymptomsAdapter(symptomsModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = heartRelatedAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
}