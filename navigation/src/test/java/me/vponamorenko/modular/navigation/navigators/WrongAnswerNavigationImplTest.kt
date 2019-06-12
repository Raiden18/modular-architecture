package me.vponamorenko.modular.navigation.navigators

import io.mockk.spyk
import io.mockk.verify
import me.vponamorenko.modular.navigation.router.Router
import org.junit.Before
import org.junit.Test

internal class WrongAnswerNavigationImplTest {
    lateinit var navigationController: Router
    lateinit var wrongAnswerNavigation: WrongAnswerNavigationImpl
    @Before
    fun setUp() {
        navigationController = spyk()
        wrongAnswerNavigation = WrongAnswerNavigationImpl(navigationController)
    }

    @Test
    fun `Should go back if was click try again`() {
        wrongAnswerNavigation.tryAgain()
        verify {
            navigationController.goBack()
        }
    }

}