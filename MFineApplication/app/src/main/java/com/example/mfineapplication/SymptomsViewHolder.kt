package com.example.mfineapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class SymptomsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val mIvImage: ImageView
    private val mTvSymptoms: TextView
    fun setData(heartRelatedModel: SymptomsModel) {
        Glide.with(mIvImage).load(heartRelatedModel.ivUrl).into(mIvImage)
        mTvSymptoms.text = heartRelatedModel.tvSymptoms
    }

    init {
        mIvImage = itemView.findViewById(R.id.ivImage)
        mTvSymptoms = itemView.findViewById(R.id.tvSymptomName)
    }
}