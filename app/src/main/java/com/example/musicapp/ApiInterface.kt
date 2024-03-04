package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {


    @GET("/search")
    @Headers("X-RapidAPI-Key: b585ddacc2mshf4aaa60df56a940p14b29fjsn6374a1559286",
        "X-RapidAPI-Hos: deezerdevs-deezer.p.rapidapi.com")
    fun getData(@Query("q")query: String):Call<MyData>
}