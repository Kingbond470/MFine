package com.example.mfineapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.ArrayList

class SearchViewAdapter(var context: Context, var userDataList: List<SymptomsModel>) :
    RecyclerView.Adapter<SearchViewAdapter.RecyclerviewHolder>() {
    var filteredUserDataList: List<SymptomsModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerviewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return RecyclerviewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerviewHolder, position: Int) {
        holder.mTvSymptomName.setText(filteredUserDataList[position].tvSymptoms)
        Glide.with(holder.mIvImage).load(filteredUserDataList[position].ivUrl).into(holder.mIvImage)
        ItemAnimation.animateFadeIn(holder.itemView, position)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, SymptomDetailActivity::class.java)
            intent.putExtra("username", filteredUserDataList[position].tvSymptoms)
            context.startActivity(intent)
        }
        holder.mIvImage.setOnClickListener {
            Toast.makeText(
                context,
                "User Name Clicked",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return filteredUserDataList.size
    }

    class RecyclerviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mIvImage: ImageView
        var mTvSymptomName: TextView

        init {
            mIvImage = itemView.findViewById(R.id.ivImage)
            mTvSymptomName = itemView.findViewById(R.id.tvSymptomName)
        }
    }

    val filter: Filter
        get() = object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val Key = charSequence.toString()
                filteredUserDataList = if (Key.isEmpty()) {
                    userDataList
                } else {
                    val lstFiltered: MutableList<SymptomsModel> = ArrayList()
                    for (row in userDataList) {
                        if (row.tvSymptoms.toLowerCase().contains(Key.toLowerCase())) {
                            lstFiltered.add(row)
                        }
                    }
                    lstFiltered
                }
                val filterResults = FilterResults()
                filterResults.values = filteredUserDataList
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                filteredUserDataList = filterResults.values as List<SymptomsModel>
                notifyDataSetChanged()
            }
        }

    init {
        filteredUserDataList = userDataList
    }
}