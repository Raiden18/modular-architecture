package me.vponomarenko.modular.navigation.questions

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val questionsModule = module {
    scope(named<QuestionsFragment>()) {
        viewModel { QuestionsViewModel(get()) }
    }
}