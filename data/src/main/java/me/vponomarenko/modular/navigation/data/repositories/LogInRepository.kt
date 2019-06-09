package me.vponomarenko.modular.navigation.data.repositories

import me.vponomarenko.modular.navigation.data.datasources.remote.LogInService
import me.vponomarenko.modular.navigation.domain.gateways.LogInGateway

internal class LogInRepository(private val remoteDataSourceLogIn: LogInService) : LogInGateway {
    override fun logIn(email: String, password: String) {
        remoteDataSourceLogIn.logInt(email, password)
    }
}