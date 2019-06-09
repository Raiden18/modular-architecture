package me.vponamorenko.modular.navigation.navigators

import me.vponamorenko.modular.navigation.controller.Router
import me.vponomarenko.modular.navigation.result.wrong.WrongAnswerNavigation

internal class WrongAnswerNavigationImpl(private val navigationController: Router) :
    WrongAnswerNavigation {

    override fun tryAgain() {
        navigationController.goBack()
    }
}