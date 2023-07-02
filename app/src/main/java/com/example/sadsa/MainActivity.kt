package com.example.sadsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        loginbutton.setOnClickListener {  // 확인용 버튼
            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()



            if (inputId == "admin@test.com" && inputPw == "qwer") {
                Toast.makeText(this, " 관리자입니다.", Toast.LENGTH_SHORT).show()
                val myIntent = Intent(this, othermain::class.java)
                startActivity(myIntent)
            }

            else {
                Toast.makeText(this, "관리자가 아닙니다.", Toast.LENGTH_SHORT).show()
            }

        }
        cancelbutton.setOnClickListener { // 취소버튼
            Log.d("메인화면", "이전 버튼 눌림")
            Toast.makeText(this, "잠시만기다려주세요..,", Toast.LENGTH_SHORT).show()

            System.exit(0)
        }






    }
}