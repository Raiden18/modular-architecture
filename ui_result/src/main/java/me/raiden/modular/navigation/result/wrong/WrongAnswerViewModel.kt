package me.raiden.modular.navigation.result.wrong

import androidx.lifecycle.ViewModel

class WrongAnswerViewModel(private val navigation: WrongAnswerNavigation) : ViewModel() {
    fun onTryAgain() {
        navigation.tryAgain()
    }
}