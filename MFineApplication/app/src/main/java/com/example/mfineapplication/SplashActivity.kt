package com.example.mfineapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, SignUp::class.java)
            startActivity(intent)
            finish()
        }, 2000)


//        val user = FirebaseAuth.getInstance().currentUser
//        if (user != null) {
//            // User is signed in
//            val i = Intent(this@LoginActivity, MainActivity::class.java)
//            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            startActivity(i)
//        } else {
//            // User is signed out
//            Log.d(TAG, "onAuthStateChanged:signed_out")
//        }

    }
}