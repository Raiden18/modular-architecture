package me.vponomarenko.modular.navigation.navigation.router

import me.vponomarenko.modular.navigation.R
import me.vponomarenko.modular.navigation.navigation.controller.NavigationController
import me.vponomarenko.modular.navigation.question.QuestionFragment
import me.vponomarenko.modular.navigation.question.QuestionNavigation
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation
import me.vponomarenko.modular.navigation.result.right.RightAnswerNavigation
import me.vponomarenko.modular.navigation.result.wrong.WrongAnswerNavigation

/**
 * Author: Valery Ponomarenko
 * Date: 30/01/2019
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class Router(private val navigationController: NavigationController) : QuestionsNavigation,
    QuestionNavigation,
    RightAnswerNavigation,
    WrongAnswerNavigation {

    override fun openQuestion(questionId: Int) {
        navigationController.navigate(
            R.id.action_questionsFragment_to_questionFragment,
            QuestionFragment.createBundle(questionId)
        )
    }

    override fun openWrongAnswer() {
        navigationController.navigate(R.id.action_questionFragment_to_wrongAnswerFragment)
    }

    override fun openRightAnswer() {
        navigationController.navigate(R.id.action_questionFragment_to_rightAnswerFragment)
    }

    override fun openAllQuestions() {
        navigationController.goBack()
    }

    override fun tryAgain() {
        navigationController.goBack()
    }
}