package me.raiden.modular.navigation.result.wrong

import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class WrongAnswerViewModelTest{
    lateinit var viewModel: WrongAnswerViewModel
    lateinit var navigation: WrongAnswerNavigation

    @Before
    fun setUp() {
        navigation = spyk()
        viewModel = WrongAnswerViewModel(navigation)
    }

    @Test
    fun `Should open try again`() {
        viewModel.onTryAgain()
        verify {
            navigation.tryAgain()
        }
    }
}
