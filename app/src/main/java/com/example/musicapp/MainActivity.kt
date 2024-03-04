package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitBuild = Retrofit.Builder().baseUrl("https://deezerdevs-deezer.p.rapidapi.com")
            .addConverterFactory( GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        val  data = retrofitBuild.getData("eminem")

        data.enqueue(object :Callback<List<MyData>?>{
            override fun onResponse(call: Call<List<MyData>?>, response: Response<List<MyData>?>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<MyData>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}