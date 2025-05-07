package com.example.tpsigeris.model

import com.google.gson.annotations.SerializedName

class Categories : ArrayList<Categories.CategoriesItem>(){
    data class CategoriesItem(
        val name: String, // Beauty
        val slug: String, // beauty
        val url: String // https://dummyjson.com/products/category/beauty
    )
}