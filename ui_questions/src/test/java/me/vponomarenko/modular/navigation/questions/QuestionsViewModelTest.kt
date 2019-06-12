package me.vponomarenko.modular.navigation.questions

import io.mockk.spyk
import io.mockk.verify
import io.mockk.verifyAll
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class QuestionsViewModelTest {
    lateinit var navigation: QuestionsNavigation
    lateinit var viewModel: QuestionsViewModel
    @Before
    fun setUp() {
        navigation = spyk()
        viewModel = QuestionsViewModel(navigation)
    }

    @Test
    fun `Should open the first question`() {
        viewModel.onFirstQuestionClick()

        verify {
            navigation.openQuestion(1)
        }
    }

    @Test
    fun `Should open the second question`() {
        viewModel.onSecondQuestionClick()

        verify {
            navigation.openQuestion(2)
        }
    }

    @Test
    fun `Should open the third question`() {
        viewModel.onThirdQuestionClick()

        verify {
            navigation.openQuestion(3)
        }
    }
}