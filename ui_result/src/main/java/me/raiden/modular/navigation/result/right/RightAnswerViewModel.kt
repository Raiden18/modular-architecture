package me.raiden.modular.navigation.result.right

import androidx.lifecycle.ViewModel

class RightAnswerViewModel(private val navigation: RightAnswerNavigation) : ViewModel() {

    fun onAllQuestionsClick() {
        navigation.openAllQuestions()
    }
}