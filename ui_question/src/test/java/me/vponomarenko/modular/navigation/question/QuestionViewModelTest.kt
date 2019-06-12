package me.vponomarenko.modular.navigation.question

import io.mockk.spyk
import io.mockk.verify
import io.mockk.verifyOrder
import me.vponomarenko.modular.navigation.domain.gateways.LogInGateway
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class QuestionViewModelTest {
    lateinit var viewModel: QuestionViewModel
    lateinit var questionNavigation: QuestionNavigation
    lateinit var logIngUseCase: LogInGateway

    @Before
    fun setUp() {
        logIngUseCase = spyk()
        questionNavigation = spyk()
        viewModel = QuestionViewModel(questionNavigation, logIngUseCase)
    }

    @Test
    fun `Should logIn and open answer if right answer was click`() {
        viewModel.onRightAnswerClick()
        verifyOrder {
            logIngUseCase.logIn(any(), any())
            questionNavigation.openRightAnswer()
        }
    }

    @Test
    fun `Should open wrong answer screen of was onWrongAnswerClick`() {
        viewModel.onWrongAnswerClick()
        verify {
            questionNavigation.openWrongAnswer()
        }
    }

}