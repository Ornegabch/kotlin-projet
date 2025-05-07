package com.example.tpsigeris.model

import com.google.gson.annotations.SerializedName

data class Products(
    @SerializedName("limit")
    val limit: Int, // 30
    @SerializedName("products")
    val products: List<Product>,
    @SerializedName("skip")
    val skip: Int, // 0
    @SerializedName("total")
    val total: Int // 194
) {
    data class Product(
        @SerializedName("availabilityStatus")
        val availabilityStatus: String, // Low Stock
        @SerializedName("brand")
        val brand: String?, // Essence
        @SerializedName("category")
        val category: String, // beauty
        @SerializedName("description")
        val description: String, // The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects. Achieve dramatic lashes with this long-lasting and cruelty-free formula.
        @SerializedName("dimensions")
        val dimensions: Dimensions,
        @SerializedName("discountPercentage")
        val discountPercentage: Double, // 7.17
        @SerializedName("id")
        val id: Int, // 1
        @SerializedName("images")
        val images: List<String>,
        @SerializedName("meta")
        val meta: Meta,
        @SerializedName("minimumOrderQuantity")
        val minimumOrderQuantity: Int, // 24
        @SerializedName("price")
        val price: Double, // 9.99
        @SerializedName("rating")
        val rating: Double, // 4.94
        @SerializedName("returnPolicy")
        val returnPolicy: String, // 30 days return policy
        @SerializedName("reviews")
        val reviews: List<Review>,
        @SerializedName("shippingInformation")
        val shippingInformation: String, // Ships in 1 month
        @SerializedName("sku")
        val sku: String, // RCH45Q1A
        @SerializedName("stock")
        val stock: Int, // 5
        @SerializedName("tags")
        val tags: List<String>,
        @SerializedName("thumbnail")
        val thumbnail: String, // https://cdn.dummyjson.com/products/images/beauty/Essence%20Mascara%20Lash%20Princess/thumbnail.png
        @SerializedName("title")
        val title: String, // Essence Mascara Lash Princess
        @SerializedName("warrantyInformation")
        val warrantyInformation: String, // 1 month warranty
        @SerializedName("weight")
        val weight: Int // 2
    ) {
        data class Dimensions(
            @SerializedName("depth")
            val depth: Double, // 28.01
            @SerializedName("height")
            val height: Double, // 14.43
            @SerializedName("width")
            val width: Double // 23.17
        )

        data class Meta(
            @SerializedName("barcode")
            val barcode: String, // 9164035109868
            @SerializedName("createdAt")
            val createdAt: String, // 2024-05-23T08:56:21.618Z
            @SerializedName("qrCode")
            val qrCode: String, // https://dummyjson.com/public/qr-code.png
            @SerializedName("updatedAt")
            val updatedAt: String // 2024-05-23T08:56:21.618Z
        )

        data class Review(
            @SerializedName("comment")
            val comment: String, // Very unhappy with my purchase!
            @SerializedName("date")
            val date: String, // 2024-05-23T08:56:21.618Z
            @SerializedName("rating")
            val rating: Int, // 2
            @SerializedName("reviewerEmail")
            val reviewerEmail: String, // john.doe@x.dummyjson.com
            @SerializedName("reviewerName")
            val reviewerName: String // John Doe
        )
    }
}