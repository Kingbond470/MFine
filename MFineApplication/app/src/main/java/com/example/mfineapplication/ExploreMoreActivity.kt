package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mfineapplication.Adapter.ExploreCategoryAdapter
import com.example.mfineapplication.Model.ExploreCategoryModel
import kotlinx.android.synthetic.main.activity_explore_more.*


class ExploreMoreActivity : AppCompatActivity() {
    private var categoryList = arrayListOf<ExploreCategoryModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_more)
        buildCategoryList()
        setCategoryRecyclerView()
        backToHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
    }
}

private fun buildCategoryList() {
    for (i in 0..10) {
        categoryList.add(
            ExploreCategoryModel(
                R.drawable.category_img1,
                "LifeStyle",
                "8 unhealthy habits that are Affecting your Productivity"
            )
        )
    }
}

private fun setCategoryRecyclerView() {
    val exploreCategoryAdapter = ExploreCategoryAdapter(categoryList)
    explore_recyclerView.layoutManager = LinearLayoutManager(this)
    explore_recyclerView.adapter = exploreCategoryAdapter
}
}