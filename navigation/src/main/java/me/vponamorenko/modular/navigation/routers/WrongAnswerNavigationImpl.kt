package me.vponamorenko.modular.navigation.routers

import me.vponamorenko.modular.navigation.controller.NavigationController
import me.vponomarenko.modular.navigation.result.wrong.WrongAnswerNavigation

internal class WrongAnswerNavigationImpl(private val navigationController: NavigationController) :
    WrongAnswerNavigation {

    override fun tryAgain() {
        navigationController.goBack()
    }
}