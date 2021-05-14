package com.ezgiekici.eticaretbtk.service

import com.ezgiekici.eticaretbtk.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductAPI {
   // https://raw.githubusercontent.com/
    // atilsamancioglu/BTK23-DataSet/main/products.json


    @GET("atilsamancioglu/BTK23-DataSet/main/products.json")
    suspend fun getData(): Response<List<Product>>



}