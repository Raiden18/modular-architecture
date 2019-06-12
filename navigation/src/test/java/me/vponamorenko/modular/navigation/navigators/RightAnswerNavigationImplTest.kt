package me.vponamorenko.modular.navigation.navigators

import io.mockk.spyk
import io.mockk.verify
import me.vponamorenko.modular.navigation.router.Router
import me.raiden.modular.navigation.result.right.RightAnswerNavigation
import org.junit.Before
import org.junit.Test

internal class RightAnswerNavigationImplTest {
    lateinit var navigationController: Router
    lateinit var rightAnswerNavigation: RightAnswerNavigation
    @Before
    fun setUp() {
        navigationController = spyk()
        rightAnswerNavigation = RightAnswerNavigationImpl(navigationController)
    }

    @Test
    fun `Should go back if all questions was click`() {
        rightAnswerNavigation.openAllQuestions()
        verify { navigationController.goBack() }
    }

}