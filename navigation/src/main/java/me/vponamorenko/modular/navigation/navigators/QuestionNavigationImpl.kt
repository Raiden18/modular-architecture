package me.vponamorenko.modular.navigation.navigators

import me.vponamorenko.modular.navigation.router.Router
import me.vponamorenko.modular.navigation.question.R
import me.vponomarenko.modular.navigation.question.QuestionNavigation

internal class QuestionNavigationImpl(private val navigationController: Router) : QuestionNavigation {
    override fun openWrongAnswer() {
        navigationController.navigate(R.id.action_questionFragment_to_wrongAnswerFragment)
    }

    override fun openRightAnswer() {
        navigationController.navigate(R.id.action_questionFragment_to_rightAnswerFragment)
    }
}