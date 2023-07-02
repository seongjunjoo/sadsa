package com.example.sadsa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phonenumber.*
import java.net.URI

class Phonenumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonenumber)

        callbutton.setOnClickListener {
            val inputphonenum = phonenumber.text.toString()

            val myUri = Uri.parse("tel:${inputphonenum}")

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)
        }


    }
}