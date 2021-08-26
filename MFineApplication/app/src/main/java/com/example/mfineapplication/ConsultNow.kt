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
    }
    private fun browseHeartRelatedProblems() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvMostSelectedIssue)
        val heartRelatedModels = ArrayList<HeartRelatedModel>()
        heartRelatedModels.add(HeartRelatedModel("https://i.postimg.cc/cCGtLgzZ/chestpain.jpg", "Chest"))
        heartRelatedModels.add(HeartRelatedModel("https://i.postimg.cc/cCGtLgzZ/chestpain.jpg", "Chest"))
        heartRelatedModels.add(HeartRelatedModel("https://i.postimg.cc/cCGtLgzZ/chestpain.jpg", "Chest"))
        heartRelatedModels.add(HeartRelatedModel("https://i.postimg.cc/cCGtLgzZ/chestpain.jpg", "Chest"))
        heartRelatedModels.add(HeartRelatedModel("https://i.postimg.cc/cCGtLgzZ/chestpain.jpg", "Chest"))
        val heartRelatedAdapter = HeartRelatedAdapter(heartRelatedModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = heartRelatedAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
}