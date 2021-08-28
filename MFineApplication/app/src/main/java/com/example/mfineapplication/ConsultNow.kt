package com.example.mfineapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mfineapplication.Fragments.FragmentExplore
import kotlinx.android.synthetic.main.activity_consult_now.*
import java.util.ArrayList

class ConsultNow : AppCompatActivity() {
    var recyclerviewAdapter: SearchViewAdapter? = null
    var search: CharSequence = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consult_now)
        btnBackConsultNow.setOnClickListener{
            val intent=Intent(applicationContext,FragmentExplore::class.java)
            startActivity(intent)
        }
        etSearchForSymptomsBtn.setOnClickListener {
            val intent= Intent(applicationContext,SearchActivity::class.java)
            startActivity(intent)
        }

        browseHeartRelatedProblems()
        browseSurgeryRelatedIssue()
        browseMentalHealthIssue()
        browseMostSelectedIssue()
        browseClinicalGenetics()
        dietAndNutrition()
    }

    private fun browseHeartRelatedProblems() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvHeartRelatedProblems)
        val heartRelatedModels = ArrayList<SymptomsModel>()
        heartRelatedModels.add(SymptomsModel("https://i.postimg.cc/Dy4HPn68/heart.jpg", "Chest Pain"))
        heartRelatedModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Leg Swelling"))
        heartRelatedModels.add(SymptomsModel("https://i.postimg.cc/0QNHMsr5/giddiness.jpg", "Giddiness"))
        heartRelatedModels.add(SymptomsModel("https://i.postimg.cc/hv0HfSrG/spots-on-screen.jpg", "Palpitation"))
        heartRelatedModels.add(SymptomsModel("https://i.postimg.cc/sfMGmNhM/other.jpg", "Other"))
        val hearthRelatedAdapter = SymptomsAdapter(heartRelatedModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = hearthRelatedAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun browseSurgeryRelatedIssue() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvSurgeryRelatedIssues)
        val surgeryRelatedIssueModels = ArrayList<SymptomsModel>()
        surgeryRelatedIssueModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Hernia"))
        surgeryRelatedIssueModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Varicose veins"))
        surgeryRelatedIssueModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg", "Ulcer"))
        surgeryRelatedIssueModels.add(SymptomsModel("https://i.postimg.cc/MHCsFf5X/swelling.jpg", "Swelling"))
        surgeryRelatedIssueModels.add(SymptomsModel("https://i.postimg.cc/sfMGmNhM/other.jpg", "Other"))
        val surgeryRelatedAdapter = SymptomsAdapter(surgeryRelatedIssueModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = surgeryRelatedAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun browseMentalHealthIssue() {
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvMentalHealthIssues)
        val mentalHealthIssueModels = ArrayList<SymptomsModel>()
        mentalHealthIssueModels.add(SymptomsModel("https://i.postimg.cc/4ymMMgT2/depression.jpg", "Depression"))
        mentalHealthIssueModels.add(SymptomsModel("https://i.postimg.cc/MTsNdGgj/anxiety.jpg", "Anxiety"))
        mentalHealthIssueModels.add(SymptomsModel("https://i.postimg.cc/C16rbQfG/ocd.jpg", "Obsessive"))
        mentalHealthIssueModels.add(SymptomsModel("https://i.postimg.cc/cCg9hBQV/stress.jpg", "Stress"))
        mentalHealthIssueModels.add(SymptomsModel("https://i.postimg.cc/sfMGmNhM/other.jpg", "Other"))
        val mentalHealthAdapter = SymptomsAdapter(mentalHealthIssueModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = mentalHealthAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun browseMostSelectedIssue(){
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvMostSelectedIssue)
        val mostSelectedIssueModels = ArrayList<SymptomsModel>()
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/8zCVfrxg/fever.jpg", "Fever"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Dark Circles"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/G3kRWRvV/acne.jpg", "Acne"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/65tKwP03/constipation.jpg", "Loose motion/Diarrhea"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/mZNxdwsG/throat.jpg", "Blocked Nose"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Heartburn"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/zfbZ0YJd/runny-rose.jpg", "Runny Nose"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/DwY3rwKJ/cough.jpg", "Cough"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/bv7X5Vrq/itching.jpg", "Itching"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/tCkjgzSz/hairfall.jpg", "Hairfall"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/ZR6kzPvp/headache.jpg", "Headache"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/65tKwP03/constipation.jpg", "Abdominal pain"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/Nfg3ZHs2/vomiting.jpg", "Vomiting"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/hv0HfSrG/spots-on-screen.jpg", "Spots on skin"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/65tKwP03/constipation.jpg", "Constipation"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Throat pain"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/hv0HfSrG/spots-on-screen.jpg", "Dry Skin"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/bv7X5Vrq/itching.jpg", "Rashes"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/Kjb6GKtV/sneezing.jpg", "Sneezing"))
        mostSelectedIssueModels.add(SymptomsModel("https://i.postimg.cc/Y0NGG2cF/other.jpg", "Other"))
        val mostSelectedIssueAdapter = SymptomsAdapter(mostSelectedIssueModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = mostSelectedIssueAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun browseClinicalGenetics(){
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvClinicalGenetics)
        val clinicalGeneticsModels = ArrayList<SymptomsModel>()
        clinicalGeneticsModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Delayed milestones"))
        clinicalGeneticsModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Cleft Lip"))
        clinicalGeneticsModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Learning Disability"))
        clinicalGeneticsModels.add(SymptomsModel("https://i.postimg.cc/fR4FHpq5/eye.jpg","Mental retardation"))
        clinicalGeneticsModels.add(SymptomsModel("https://i.postimg.cc/sfMGmNhM/other.jpg","Other"))
        val clinicalGeneticsAdapter = SymptomsAdapter(clinicalGeneticsModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = clinicalGeneticsAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
    private fun dietAndNutrition(){
        val rvRecyclerView = findViewById<RecyclerView>(R.id.rvDietAndNutrition)
        val dietAndNutritionModels = ArrayList<SymptomsModel>()
        dietAndNutritionModels.add(SymptomsModel("https://i.postimg.cc/dV8fg6zF/diet.jpg","Diet For Gaining Weight"))
        dietAndNutritionModels.add(SymptomsModel("https://i.postimg.cc/dV8fg6zF/diet.jpg","Diet For Weight Loss"))
        dietAndNutritionModels.add(SymptomsModel("https://i.postimg.cc/D0HD3Mvv/diet-dibatees.jpg","Diet For Diabetes"))
        dietAndNutritionModels.add(SymptomsModel("https://i.postimg.cc/D0HD3Mvv/diet-dibatees.jpg","Diet For Hypertension"))
        dietAndNutritionModels.add(SymptomsModel("https://i.postimg.cc/sfMGmNhM/other.jpg","Other"))
        val dietAndNutritionAdapter = SymptomsAdapter(dietAndNutritionModels)
        val gridLayoutManager = GridLayoutManager(this, 2)
        rvRecyclerView.adapter = dietAndNutritionAdapter
        rvRecyclerView.layoutManager = gridLayoutManager
    }
}