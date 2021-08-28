package com.example.mfineapplication

import android.content.Intent
import android.net.Uri
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

        //Opening YouTube onClick of Thumbnail

        video1.setOnClickListener {
            openVideo("https://youtu.be/XerQiH1AHY4")
        }
        video2.setOnClickListener {
            openVideo("https://youtu.be/PMzvbztSFI8")
        }
        video3.setOnClickListener {
            openVideo("https://youtu.be/Gcz0tB_a4dY")
        }
        video4.setOnClickListener {
            openVideo("https://youtu.be/dqulL1ALdqg")
        }
        video5.setOnClickListener {
            openVideo("https://youtu.be/Gz-wLcSFDh0")
        }
        video6.setOnClickListener {
            openVideo("https://youtu.be/8lEpvr4Pe-Q")
        }


    }

    private fun buildCategoryList() {
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/sXMWt1Rq/category-img1.jpg",
                "LifeStyle",
                "8 unhealthy habits that are Affecting your Productivity"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/L6Lt9qZM/category-img2.jpg",
                "DIET & NUTRITION",
                "Breastfeeding Die: What to Eat vs What Not to Eat"
            )
        )

        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/CKLksmrF/category-img3.png",
                "Mental Health",
                "Zoom fatigue: How The Online Work Schedule is Affecting Us"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/4yh319T4/category-img4.jpg",
                "Parenting",
                "Best breastfeeding positions to soothe you and your baby"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/3wSpSmz2/category-img5.jpg",
                "Cure PCOS",
                "How to cure PCOS Permanently"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/9z5QgQWd/category-img6.jpg",
                "Breastfeeding Week",
                "10 Best Breastfeeding positions for new Mothers"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/BnC2FdgY/category-img7.jpg",
                "Diaper",
                "Diaper Rashes Home Remedies:10 Important Tips"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/44Kv02fy/category-img8.jpg",
                "Thyroid",
                "Why are  Thyroid problem more common in Women"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/9z5QgQWd/category-img6.jpg",
                "Common Breastfeeding Myths",
                "Common Breastfeeding Myths every MOM should ignore"
            )
        )
        categoryList.add(
            ExploreCategoryModel(
                "https://i.postimg.cc/x1QKc0KN/category-img10.jpg",
                "Health A To Z",
                "7 Types of Psoriasis Triggers and Symptoms"
            )
        )

    }

    private fun setCategoryRecyclerView() {
        val exploreCategoryAdapter = ExploreCategoryAdapter(categoryList)
        explore_recyclerView.layoutManager = LinearLayoutManager(this)
        explore_recyclerView.adapter = exploreCategoryAdapter
    }


    private fun openVideo(url: String) {
        val uri = Uri.parse(url)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
}