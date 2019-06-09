package me.vponomarenko.modular.navigation.result.wrong

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val wrongAnswerViewModel = module {
    scope(named<WrongAnswerFragment>()) {
        viewModel { WrongAnswerViewModel(get()) }
    }
}