package com.example.musicapp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Activity, val dataList: List<MyData>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    class ViewHolder(intView: View): RecyclerView.ViewHolder(intView) {
        private val image: ImageView
        private val title: TextView
        private val play: ImageButton
        private val pause: ImageButton

        init {
            image = intView.findViewById(R.id.cover)
            title = intView.findViewById(R.id.tVMusicTitle)
            play = intView.findViewById(R.id.btnPlay)
            pause = intView.findViewById(R.id.btnPause)
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