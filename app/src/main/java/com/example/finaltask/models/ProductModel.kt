package com.example.finaltask.models

data class ProductModel(

    var id:Int,
    var price:Int,
    var quantity:Int,
    var restaurant_id:Int,
    var name :String,
    var image:String

    )

data class ProductInfoModel(

    var status:Boolean,
    var message:String,
    var count:Int,
    var productlist:List<ProductModel>

    )

data class ProductsModels(

    var status: Boolean,
    var message: String,
    var data :ArrayList<ProductInfoModel>

    )
