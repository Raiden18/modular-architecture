package me.vponomarenko.modular.navigation.result.wrong

import com.me.vponomarenko.modular.navigation.imagebinder.ImageBinder
import com.me.vponomarenko.modular.navigation.imagebinder.ImageBinderImpl
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val wrongAnswerViewModel = module {
    scope(named<WrongAnswerFragment>()) {
        viewModel { WrongAnswerViewModel(get()) }
        scoped<ImageBinder> { ImageBinderImpl(get()) }
    }
}