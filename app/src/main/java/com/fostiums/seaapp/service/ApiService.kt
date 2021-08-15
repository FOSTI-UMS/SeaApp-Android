package com.fostiums.seaapp.service

import com.fostiums.seaapp.models.CredentialResponse
import com.fostiums.seaapp.models.ProductResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("products")
    fun getProductAll(
        @Query("page") page: Int,
    ): Call<ProductResponse>


    @GET("seller/products")
    fun getProductPenjualAll(
        @Header("Authorization") authHeader: String,
        @Query("page") page: Int,
    ): Call<ProductResponse>


    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<CredentialResponse>

}