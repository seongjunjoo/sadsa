package com.example.sadsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.acti.*

class cardview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview)

        var recyclerView = recyclerview_main // recyclerview id

        var layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        var adapter = MyAdapter()
        recyclerView.adapter = adapter
    }
}