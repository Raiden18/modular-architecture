package me.vponamorenko.modular.navigation.navigators

import android.os.Bundle
import io.mockk.every
import io.mockk.internalSubstitute
import io.mockk.spyk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.question.R
import me.vponamorenko.modular.navigation.router.Router
import me.vponomarenko.modular.navigation.question.QuestionFragment.Companion.EXTRA_QUESTION_ID
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation
import org.junit.Before
import org.junit.Test

internal class QuestionsNavigationImplTest {
    lateinit var navigationController: Router
    lateinit var arguments: QuestionFragmentArguments
    lateinit var questionsNavigationImpl: QuestionsNavigation
    @Before
    fun setUp() {
        navigationController = spyk()
        arguments = spyk()
        questionsNavigationImpl = QuestionsNavigationImpl(navigationController, arguments)
    }

    @Test
    fun `Should set arguments for question screen`() {
        val questionId = 1

        questionsNavigationImpl.openQuestion(questionId)

        verify { arguments.setQuestionId(questionId) }
    }


    @Test
    fun `Should open question screen`() {
        val id = 1

        questionsNavigationImpl.openQuestion(id)
        val expectedArgs = arguments.setQuestionId(id)

        verify {
            navigationController.navigate(R.id.action_questionsFragment_to_questionFragment, expectedArgs)
        }
    }
}