package me.vponamorenko.modular.navigation.di

import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArgumentsImpl
import me.vponamorenko.modular.navigation.controller.NavigationController
import me.vponamorenko.modular.navigation.controller.NavigationControllerImpl
import me.vponamorenko.modular.navigation.routers.QuestionNavigationImpl
import me.vponamorenko.modular.navigation.routers.QuestionsNavigationImpl
import me.vponamorenko.modular.navigation.routers.RightAnswerNavigationImpl
import me.vponamorenko.modular.navigation.routers.WrongAnswerNavigationImpl
import me.vponomarenko.modular.navigation.question.QuestionNavigation
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation
import me.vponomarenko.modular.navigation.result.right.RightAnswerNavigation
import me.vponomarenko.modular.navigation.result.wrong.WrongAnswerNavigation
import org.koin.dsl.module

val navigationModule = module {
    //Routers
    single<QuestionsNavigation> { QuestionsNavigationImpl(get(), get()) }
    single<QuestionNavigation> { QuestionNavigationImpl(get()) }
    single<RightAnswerNavigation> { RightAnswerNavigationImpl(get()) }
    single<WrongAnswerNavigation> { WrongAnswerNavigationImpl(get()) }

    //Controller
    single<NavigationController> { NavigationControllerImpl() }

    //Arguments
    single<QuestionFragmentArguments> { QuestionFragmentArgumentsImpl() }
}