package com.example.sadsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok_button.setOnClickListener {  // 확인용 버튼
            Log.d("메인화면", "확인 버튼 눌림")
        }
        cancel_button.setOnClickListener { // 취소버튼
            Log.d("메인화면","이전화면 버튼 눌림")
        }


    }
}