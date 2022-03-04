package com.example.finaltask.reposatories

import com.example.finaltask.models.ProductModel
import com.example.finaltask.retrofit.RetrofitFactory
import retrofit2.Response

class RetrofitRepository {

    suspend fun getAllProducts():Response<ProductModel>{
        return RetrofitFactory.apiInterface.getAllProducts()
    }
}