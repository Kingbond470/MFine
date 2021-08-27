package com.example.mfineapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mfineapplication.Model.ExploreCategoryModel
import com.example.mfineapplication.R
import com.example.mfineapplication.ViewHolder.CategoryViewHolder

class ExploreCategoryAdapter(private val categoryList: List<ExploreCategoryModel>) :
    RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.explore_more_category_layout, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val model = categoryList[position]
        holder.setCategoryData(model)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}