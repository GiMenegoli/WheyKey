package com.menegoli.wheykey.service

import com.menegoli.wheykey.model.Machine
import com.menegoli.wheykey.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

internal interface Service {

    @GET("user")
    fun listUser(): Call<List<User>>

    @GET("user/{Id}")
    fun getUserById(@Path("id") snackId: Int): Call<User>

    @GET("machine")
    fun listMachibe(): Call<List<Machine>>

    @GET("machine/{id}")
    fun getMachineById(@Path("id") idExtra: Int?): Call<Machine>




}