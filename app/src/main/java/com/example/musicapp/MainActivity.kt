package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitBuild = Retrofit.Builder().baseUrl("https://deezerdevs-deezer.p.rapidapi.com")
            .addConverterFactory( GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        val  data = retrofitBuild.getData("eminem")

        data.enqueue(object :Callback<MyData?>{
            override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
                val  dataList = response.body()
                val  texView = findViewById<TextView>(R.id.helloText)
                texView.text = dataList.toString()
                Log.d("TAG: onResponse","onResponse: "+response.body())
            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
                Log.d("TAG: onResponse","onResponse: "+t.message)
            }
        })
    }
}