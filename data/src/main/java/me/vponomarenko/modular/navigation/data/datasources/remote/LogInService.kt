package me.vponomarenko.modular.navigation.data.datasources.remote

internal interface LogInService {
    fun logInt(email: String, password: String)
}