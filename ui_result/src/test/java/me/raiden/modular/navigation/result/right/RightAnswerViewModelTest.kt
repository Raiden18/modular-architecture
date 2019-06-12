package me.raiden.modular.navigation.result.right

import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class RightAnswerViewModelTest {
    lateinit var viewModel: RightAnswerViewModel
    lateinit var navigation: RightAnswerNavigation

    @Before
    fun setUp() {
        navigation = spyk()
        viewModel = RightAnswerViewModel(navigation)
    }

    @Test
    fun `Should open all questions if onAllQuestionsWasClicked`() {
        viewModel.onAllQuestionsClick()
        verify {
            navigation.openAllQuestions()
        }
    }
}