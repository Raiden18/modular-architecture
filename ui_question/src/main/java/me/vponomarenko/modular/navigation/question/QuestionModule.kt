package me.vponomarenko.modular.navigation.question

import me.vponomarenko.modular.navigation.domain.usecases.login.LogInUseCase
import me.vponomarenko.modular.navigation.domain.usecases.login.LogInUseCaseImpl
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val questionModule = module {
    scope(named<QuestionFragment>()) {
        scoped<LogInUseCase> { LogInUseCaseImpl(get()) }
        viewModel { QuestionViewModel(get(), get()) }
    }
}