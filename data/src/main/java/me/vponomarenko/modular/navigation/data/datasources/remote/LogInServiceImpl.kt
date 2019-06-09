package me.vponomarenko.modular.navigation.data.datasources.remote

import android.util.Log

class LogInServiceImpl : LogInService {

    override fun logInt(email: String, password: String) {
        Log.i("HUI", "USER WAS LOGIN")
    }
}