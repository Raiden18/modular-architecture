package me.raiden.modular.navigation.data.repositories

import me.raiden.modular.navigation.data.datasources.remote.LogInService
import me.raiden.modular.navigation.domain.gateways.LogInGateway

internal class LogInRepository(private val remoteDataSourceLogIn: LogInService) : LogInGateway {
    override fun logIn(email: String, password: String) {
        remoteDataSourceLogIn.logInt(email, password)
    }
}