package me.vponomarenko.modular.navigation.domain.usecases.login

interface LogInUseCase {
    fun logIn(email: String, password: String)
}