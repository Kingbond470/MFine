package com.example.mfineapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*


class SymptomsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(heartRelatedModel: SymptomsModel) {
        itemView.apply {
                Glide.with(ivImage).load(heartRelatedModel.ivUrl).into(ivImage)
            tvSymptomName.text = heartRelatedModel.tvSymptoms
        }
    }
}