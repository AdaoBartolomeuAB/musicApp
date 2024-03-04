package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}