package com.example.mfineapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*
import android.text.method.PasswordTransformationMethod

import android.text.method.HideReturnsTransformationMethod
import android.view.View
import android.view.WindowManager
import android.widget.RadioButton
import android.widget.Toast
import com.example.mfineapplication.Model.User
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_sign_up.*


class CreateAccount : AppCompatActivity() {

    private lateinit var databaseReference: DatabaseReference

    private var sex:String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        Toast.makeText(applicationContext,intent?.getStringExtra("phone").toString(),Toast.LENGTH_SHORT).show()


//        fun onRadioButtonClicked(view: View) {
//            if (view is RadioButton) {
//                // Is the button now checked?
//                val checked = view.isChecked
//
//                // Check which radio button was clicked
//                when (view.getId()) {
//                    R.id.rbMale ->
//                        if (checked) {
//                            // Male Selected
//                            sex="Male"
//                        }
//                    R.id.rbFemale ->
//                        if (checked) {
//                            // Female Selected
//                            sex="Female"
//                        }
//                    R.id.rbOthers ->
//                        if(checked) {
//                            // Others Selected
//                            sex="Others"
//                        }
//                }
//            }
//
//        }
//
//    onRadioButtonClicked(view)


        rbMale.setOnClickListener(){
            sex="Male"
        }
        rbFemale.setOnClickListener(){
            sex="FeMale"
        }
        rbOthers.setOnClickListener(){
            sex="Others"
        }




//        tvHospitalCode.setOnClickListener {
//
//            val manager = fragmentManager
//            val transaction: android.app.FragmentTransaction? = manager.beginTransaction()
//            val hospitalCode:HospitalCode = HospitalCode()
//            transaction?.replace(R.id.fragmentHospitalCode, hospitalCode, "hospitalcode")
//        }

        databaseReference=FirebaseDatabase.getInstance().reference



        btnCreate.setOnClickListener {
            //val bundle = Bundle()


            var name:String=etNameCreateAccount.text.toString()
            var password:String=etSetPasswordCreateAccount.text.toString()
            var email:String=etEmailCreateAccount.text.toString()
          var phone: String? =intent?.getStringExtra("phone")

            var sexType:String=sex.toString()
            var user=User(name,password,phone,email,sexType)

           //var user= phone?.let { it1 -> User(name,password, it1,email) }
          //  databaseReference.child("Users").child().push().setValue(user)
//            databaseReference.child("Users").push().child(name).child("name").setValue(user.name)
//            databaseReference.child("Users").push().child(name).child("name").setValue(user.name)
            databaseReference.child("Users").push().child(name).setValue(user)



//            databaseReference.child("Users").push().child(name).child("name").setValue(name)
//            databaseReference.child("Users").push().child(name).child("phoneNo").setValue(phone)
//            databaseReference.child("Users").push().child(name).child("email").setValue(email)
//            databaseReference.child("Users").push().child(name).child("password").setValue(password)
//            databaseReference.child("Users").push().child(name).child("sex").setValue(sexType)


            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }



        etSetPasswordCreateAccount.transformationMethod = PasswordTransformationMethod.getInstance()
        btnShowHide.setOnClickListener {
            if (etSetPasswordCreateAccount.transformationMethod == PasswordTransformationMethod.getInstance()) {
                etSetPasswordCreateAccount.transformationMethod = HideReturnsTransformationMethod.getInstance()
                btnShowHide.setBackgroundResource(R.drawable.password_show)

                //placing cursor at the end of the text
                etSetPasswordCreateAccount.setSelection(etSetPasswordCreateAccount.text.toString().length)
            } else {
                etSetPasswordCreateAccount.transformationMethod = PasswordTransformationMethod.getInstance()
                btnShowHide.setBackgroundResource(R.drawable.password_hide)

                //placing cursor at the end of the text
                etSetPasswordCreateAccount.setSelection(etSetPasswordCreateAccount.text.toString().length)
            }

        }

    }
}

