package com.menegoli.wheykey.service

import android.provider.SyncStateContract
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository internal constructor(){

    private val service: Service

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(Service::class.java)
    }

}