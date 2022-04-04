package com.app.retrofitpractice

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        Handler().postDelayed({              //Splash Activity

            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }, 5000)
    }
}