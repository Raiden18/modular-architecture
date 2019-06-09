package me.vponomarenko.modular.navigation.question

import androidx.lifecycle.ViewModel
import me.vponomarenko.modular.navigation.domain.gateways.LogInGateway

class QuestionViewModel(
    private val questionNavigation: QuestionNavigation,
    private val logIngUseCase: LogInGateway
) : ViewModel() {

    fun openRightAnswer() {
        logIngUseCase.logIn("asd", "asd123123")
        questionNavigation.openRightAnswer()
    }

    fun openWrongAnswer() {
        questionNavigation.openWrongAnswer()
    }
}