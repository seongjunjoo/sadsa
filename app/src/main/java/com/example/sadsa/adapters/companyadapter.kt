package com.example.sadsa.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.sadsa.R

class companyadapter(
    val mContext : Context,
    val resId: Int,
    val mList: ArrayList<List>) :ArrayAdapter<List>(mContext, resId, mList){

    val inf = LayoutInflater.from(companyadapter)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.companylist, null)
        }

        val row = tempRow!!

        return row

    }



}