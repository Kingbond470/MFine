package com.example.mfineapplication.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mfineapplication.Model.ExploreCategoryModel
import kotlinx.android.synthetic.main.explore_more_category_layout.view.*


class CategoryViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun setCategoryData(model: ExploreCategoryModel) {
        view.apply {
            Glide.with(category_image).load(model.categoryImage).into(category_image)
            category_name.text = model.categoryName
            category_desc.text = model.categoryDescription
        }
    }
}