package me.vponamorenko.modular.navigation.navigators

import me.vponamorenko.modular.navigation.controller.Router
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.question.R
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation

internal class QuestionsNavigationImpl(
    private val navigationController: Router,
    private val bundlesScreens: QuestionFragmentArguments
) : QuestionsNavigation {

    override fun openQuestion(questionId: Int) {
        val questionData = bundlesScreens.setQuestionId(questionId)
        navigationController.navigate(R.id.action_questionsFragment_to_questionFragment, questionData)
    }
}