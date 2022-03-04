package com.example.finaltask.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {

    private val retrofitClient = OkHttpClient.Builder().apply {
        addInterceptor(RetrofitInterceptor())
    }.build()

    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://android-training.appssquare.com/").client(retrofitClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    val apiInterface:ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}