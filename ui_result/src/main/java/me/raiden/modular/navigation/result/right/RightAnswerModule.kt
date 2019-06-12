package me.raiden.modular.navigation.result.right

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val rightAnswerViewModel = module {
    scope(named<RightAnswerFragment>()) {
        viewModel { RightAnswerViewModel(get()) }
    }
}