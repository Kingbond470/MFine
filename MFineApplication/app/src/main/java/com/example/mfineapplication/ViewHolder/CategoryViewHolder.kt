package com.example.mfineapplication.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mfineapplication.Model.ExploreCategoryModel
import kotlinx.android.synthetic.main.explore_more_category_layout.view.*


class CategoryViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun setCategoryData(model: ExploreCategoryModel) {
        view.apply {
            category_image.setImageResource(model.categoryImage)
            category_name.text = model.categoryName
            category_desc.text = model.categoryDescription
        }
    }
}