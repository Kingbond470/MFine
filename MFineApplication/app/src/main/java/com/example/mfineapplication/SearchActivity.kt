package com.example.mfineapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_search.*
import java.util.ArrayList

class SearchActivity : AppCompatActivity() {
    var recyclerviewAdapter: SearchViewAdapter? = null
    var search: CharSequence = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val userDataList: MutableList<SymptomsModel> = ArrayList()
        userDataList.add(SymptomsModel("https://i.postimg.cc/8zCVfrxg/fever.jpg", "Fever"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Dark Circles"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/G3kRWRvV/acne.jpg", "Acne"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/65tKwP03/constipation.jpg", "Loose motion/Diarrhea"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/mZNxdwsG/throat.jpg", "Blocked Nose"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Heartburn"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/zfbZ0YJd/runny-rose.jpg", "Runny Nose"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/DwY3rwKJ/cough.jpg", "Cough"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/bv7X5Vrq/itching.jpg", "Itching"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/tCkjgzSz/hairfall.jpg", "Hairfall"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/ZR6kzPvp/headache.jpg", "Headache"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/65tKwP03/constipation.jpg", "Abdominal pain"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/Nfg3ZHs2/vomiting.jpg", "Vomiting"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/hv0HfSrG/spots-on-screen.jpg", "Spots on skin"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/65tKwP03/constipation.jpg", "Constipation"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Throat pain"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/hv0HfSrG/spots-on-screen.jpg", "Dry Skin"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/bv7X5Vrq/itching.jpg", "Rashes"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Sneezing"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Delayed milestones"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Cleft Lip"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Learning Disability"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Mental retardation"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/dV8fg6zF/diet.jpg","Diet For Gaining Weight"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/dV8fg6zF/diet.jpg","Diet For Weight Loss"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/D0HD3Mvv/diet-dibatees.jpg","Diet For Diabetes"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/D0HD3Mvv/diet-dibatees.jpg","Diet For Hypertension"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/4ymMMgT2/depression.jpg", "Depression"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/MTsNdGgj/anxiety.jpg", "Anxiety"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/C16rbQfG/ocd.jpg", "Obsessive"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/cCg9hBQV/stress.jpg", "Stress"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Hernia"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Varicose veins"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Ulcer"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/MHCsFf5X/swelling.jpg", "Swelling"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/Dy4HPn68/heart.jpg", "Chest Pain"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Leg Swelling"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/0QNHMsr5/giddiness.jpg", "Giddiness"))
        userDataList.add(SymptomsModel("https://i.postimg.cc/hv0HfSrG/spots-on-screen.jpg", "Palpitation"))
        setUserRecycler(userDataList)
        etSearchData.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                recyclerviewAdapter?.filter?.filter(charSequence)
                search = charSequence
            }

            override fun afterTextChanged(editable: Editable) {}
        })
    }

    private fun setUserRecycler(userDataList: List<SymptomsModel>) {
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView.setLayoutManager(layoutManager)
        recyclerviewAdapter = SearchViewAdapter(this, userDataList)
        recyclerView.setAdapter(recyclerviewAdapter)
    }
}