package com.example.tpsigeris.model

data class UserModel(
    val email: String,
    val firstName: String,
    val gender: String,
    val id: Int,
    val image: String,
    val lastName: String,
    val token: String,
    val username: String,
    val password: String,
    val expiresInMins: Int
)

data class LoginModel(
    val username: String,
    val password: String,
    val expiresInMins: Int
)