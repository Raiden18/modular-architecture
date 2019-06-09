package me.vponamorenko.modular.navigation.routers

import me.vponamorenko.modular.navigation.controller.NavigationController
import me.vponomarenko.modular.navigation.result.right.RightAnswerNavigation

internal class RightAnswerNavigationImpl(
    private val navigationController: NavigationController) : RightAnswerNavigation {
    override fun openAllQuestions() {
        navigationController.goBack()
    }
}