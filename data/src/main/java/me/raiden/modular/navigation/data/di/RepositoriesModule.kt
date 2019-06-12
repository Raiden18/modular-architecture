package me.raiden.modular.navigation.data.di

import me.raiden.modular.navigation.data.repositories.LogInRepository
import me.raiden.modular.navigation.domain.gateways.LogInGateway
import org.koin.dsl.module

val repositoriesModule = module(createdAtStart = true) {
    single<LogInGateway> { LogInRepository(get()) }
}