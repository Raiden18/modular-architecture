package me.vponamorenko.modular.navigation.navigators

import me.vponamorenko.modular.navigation.router.Router
import me.raiden.modular.navigation.result.right.RightAnswerNavigation

internal class RightAnswerNavigationImpl(private val navigationController: Router) : RightAnswerNavigation {
    override fun openAllQuestions() {
        navigationController.goBack()
    }
}