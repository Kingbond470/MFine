package com.example.mfineapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class HeartRelatedAdapter(private val heartRelatedModels: ArrayList<HeartRelatedModel>) :
    RecyclerView.Adapter<HeartRelatedViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeartRelatedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return HeartRelatedViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeartRelatedViewHolder, position: Int) {
        val heartRelatedModel = heartRelatedModels[position]
        holder.setData(heartRelatedModel)
    }

    override fun getItemCount(): Int {
        return heartRelatedModels.size
    }
}