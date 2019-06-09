package me.vponomarenko.modular.navigation.domain.usecases.login

import me.vponomarenko.modular.navigation.domain.gateways.LogInGateway

class LogInUseCaseImpl(private val logInGateway: LogInGateway) : LogInUseCase {
    override fun logIn(email: String, password: String) {
        logInGateway.logIn(email, password)
    }
}