package com.example.alc4phase1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        about_alc.setOnClickListener {
            navigateToAlcWebPage(it)
        }
        my_profile.setOnClickListener {
            navigateToProfilePage(it)
        }
    }


    private fun navigateToAlcWebPage(view: View){
        val intent = Intent(view.context, AlcWebPage()::class.java )
        startActivity(intent)
    }

    private fun navigateToProfilePage(view: View){
        val intent = Intent(view.context,Myprofile()::class.java)
        startActivity(intent)
    }


}
