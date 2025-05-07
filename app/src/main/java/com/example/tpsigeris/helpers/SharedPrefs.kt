package com.example.tpsigeris.helpers

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.example.tpsigeris.model.UserModel
import com.google.gson.Gson

class SharedPrefs(activity: Activity) {
    val mypref = "MAIN_PRF"
    val sp: SharedPreferences
    init {
        sp = activity.getSharedPreferences(mypref, Context.MODE_PRIVATE)
    }
    fun setStatusLogin(status: Boolean) {
        sp.edit().putBoolean("login", status).apply()
    }
    fun getStatusLogin(): Boolean {
        return sp.getBoolean("login", false)
    }
    fun setUser(value: UserModel) {
        val data: String = Gson().toJson(value, UserModel::class.java)
        sp.edit().putString("user", data).apply()
    }
    fun getUser(): UserModel? {
        val data:String = sp.getString("user", null) ?: return null
        return Gson().fromJson<UserModel>(data, UserModel::class.java)
    }
    fun setString(key: String, value: String) {
        sp.edit().putString(key, value).apply()
    }
    fun getString(key: String): String {
        return sp.getString(key, "")!!
    }
    fun clear(){
        sp.edit().clear().apply()
    }
}