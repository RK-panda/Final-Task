package com.example.finaltask.retrofit

import com.example.finaltask.models.PostProductModel
import com.example.finaltask.models.ProductModel
import com.example.finaltask.models.UserModel
import com.example.finaltask.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {


    @POST("api/login")
    suspend fun login(@Body userLogin: UserModel):Response<UserResponse>

    @GET("api/products")
    suspend fun getAllProducts():Response<ProductModel>

//    @POST("api/products")
//    suspend fun addProducts(@Body product: PostProductModel):Response<PostProductModel>

}