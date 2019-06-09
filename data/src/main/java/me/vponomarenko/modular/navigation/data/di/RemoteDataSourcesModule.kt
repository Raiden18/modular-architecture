package me.vponomarenko.modular.navigation.data.di

import me.vponomarenko.modular.navigation.data.datasources.remote.LogInService
import me.vponomarenko.modular.navigation.data.datasources.remote.LogInServiceImpl
import org.koin.dsl.module

val remoteDataSourcesModule = module(createdAtStart = true) {
    single<LogInService> { LogInServiceImpl() }
}
