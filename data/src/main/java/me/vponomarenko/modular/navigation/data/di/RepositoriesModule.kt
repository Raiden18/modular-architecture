package me.vponomarenko.modular.navigation.data.di

import me.vponomarenko.modular.navigation.data.repositories.LogInRepository
import me.vponomarenko.modular.navigation.domain.gateways.LogInGateway
import org.koin.dsl.module

val repositoriesModule = module(createdAtStart = true) {
    single<LogInGateway> { LogInRepository(get()) }
}