package me.vponamorenko.modular.navigation.navigators

import io.mockk.spyk
import io.mockk.verify
import me.vponamorenko.modular.navigation.question.R
import me.vponamorenko.modular.navigation.router.Router
import me.raiden.modular.navigation.question.QuestionNavigation
import org.junit.Before
import org.junit.Test

internal class QuestionNavigationImplTest {
    lateinit var navigationController: Router
    lateinit var questionNavigationImpl: QuestionNavigation

    @Before
    fun setUp() {
        navigationController = spyk()
        questionNavigationImpl = QuestionNavigationImpl(navigationController)
    }

    @Test
    fun `Should open wrong answer screen`() {
        questionNavigationImpl.openWrongAnswer()
        verify { navigationController.navigate(R.id.action_questionFragment_to_wrongAnswerFragment) }
    }

    @Test
    fun `Should open right answer screen`() {
        questionNavigationImpl.openRightAnswer()
        verify { navigationController.navigate(R.id.action_questionFragment_to_rightAnswerFragment) }
    }

}