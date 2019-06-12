package me.vponamorenko.modular.navigation.navigators

import me.vponamorenko.modular.navigation.router.Router
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.question.R
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation

internal class QuestionsNavigationImpl(
    private val navigationController: Router,
    private val arguments: QuestionFragmentArguments
) : QuestionsNavigation {

    override fun openQuestion(questionId: Int) {
        val questionData = arguments.setQuestionId(questionId)
        navigationController.navigate(R.id.action_questionsFragment_to_questionFragment, questionData)
    }
}