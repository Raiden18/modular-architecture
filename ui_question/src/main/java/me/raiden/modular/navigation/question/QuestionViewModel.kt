package me.raiden.modular.navigation.question

import androidx.lifecycle.ViewModel
import me.raiden.modular.navigation.domain.gateways.LogInGateway

class QuestionViewModel(
    private val questionNavigation: QuestionNavigation,
    private val logIngUseCase: LogInGateway
) : ViewModel() {

    fun onRightAnswerClick() {
        logIngUseCase.logIn("asd", "asd123123")
        questionNavigation.openRightAnswer()
    }

    fun onWrongAnswerClick() {
        questionNavigation.openWrongAnswer()
    }
}