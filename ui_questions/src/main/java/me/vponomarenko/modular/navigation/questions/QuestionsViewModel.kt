package me.vponomarenko.modular.navigation.questions

import androidx.lifecycle.ViewModel

class QuestionsViewModel(private val navigation: QuestionsNavigation) : ViewModel() {

    fun onFirstQuestionClick() {
        navigation.openQuestion(1)
    }

    fun onSecondQuestionClick() {
        navigation.openQuestion(2)
    }

    fun onThirdQuestionClick() {
        navigation.openQuestion(3)
    }
}