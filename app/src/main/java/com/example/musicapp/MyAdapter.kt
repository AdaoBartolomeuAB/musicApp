package com.example.musicapp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Activity, val dataList: List<MyData>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder(intView: View): RecyclerView.ViewHolder(intView) {
        val textView: TextView

        init {
            textView = intView.findViewById(R.id.helloText)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}