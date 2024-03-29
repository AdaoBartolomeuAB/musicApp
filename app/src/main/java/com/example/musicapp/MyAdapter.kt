package com.example.musicapp

import android.app.Activity
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Activity, val dataList: List<Data>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView
        val title: TextView
        val play: ImageButton
        val pause: ImageButton

        init {
            image = itemView.findViewById(R.id.cover)
            title = itemView.findViewById(R.id.tVMusicTitle)
            play = itemView.findViewById(R.id.btnPlay)
            pause = itemView.findViewById(R.id.btnPause)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.each_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentData = dataList[position]
        val mediaPlayer  = MediaPlayer.create(context,currentData.preview.toUri())
        holder.title.text = currentData.title
        Picasso.get().load(currentData.album.cover).into(holder.image)
        holder.play.setOnClickListener {
            mediaPlayer.start()
        }
        holder.pause.setOnClickListener{
            mediaPlayer.pause()
        }
    }
}