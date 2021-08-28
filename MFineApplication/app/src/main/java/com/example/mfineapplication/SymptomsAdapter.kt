package com.example.mfineapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class SymptomsAdapter(private val heartRelatedModels: ArrayList<SymptomsModel>) : RecyclerView.Adapter<SymptomsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SymptomsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return SymptomsViewHolder(view)
    }

    override fun onBindViewHolder(holder: SymptomsViewHolder, position: Int) {
        val heartRelatedModel = heartRelatedModels[position]
        holder.setData(heartRelatedModel)
    }

    override fun getItemCount(): Int {
        return heartRelatedModels.size
    }
}