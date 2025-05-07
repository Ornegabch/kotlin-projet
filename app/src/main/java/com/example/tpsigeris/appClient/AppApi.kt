package com.example.tpsigeris.appClient

import com.example.tpsigeris.model.Categories
import com.example.tpsigeris.model.LoginModel
import com.example.tpsigeris.model.Products
import com.example.tpsigeris.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface AppApi {
    @POST("/auth/login")
    suspend fun login(@Body() user : LoginModel): UserModel
    @GET("/products")
    suspend fun getProducts(): Response<Products>
    @GET("/products/{prodId}")
    suspend fun getOneProducts(@Path("prodId") prodId: String ): Response<Products.Product>
    @GET("products/categories")
    suspend fun getProductsCategories(): Response<Categories>
    @GET("products/category/{catName}")
    suspend fun getProductsByCategories(@Path("catName") catName: String ): Response<Products>
}