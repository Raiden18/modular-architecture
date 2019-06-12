package me.vponamorenko.modular.navigation.di

import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArgumentsImpl
import me.vponamorenko.modular.navigation.router.Router
import me.vponamorenko.modular.navigation.router.RouterImpl
import me.vponamorenko.modular.navigation.navigators.QuestionNavigationImpl
import me.vponamorenko.modular.navigation.navigators.QuestionsNavigationImpl
import me.vponamorenko.modular.navigation.navigators.RightAnswerNavigationImpl
import me.vponamorenko.modular.navigation.navigators.WrongAnswerNavigationImpl
import me.raiden.modular.navigation.question.QuestionNavigation
import me.raiden.modular.navigation.questions.QuestionsNavigation
import me.raiden.modular.navigation.result.right.RightAnswerNavigation
import me.raiden.modular.navigation.result.wrong.WrongAnswerNavigation
import org.koin.dsl.module

val navigationModule = module(createdAtStart = true) {
    //Navigators
    single<QuestionsNavigation> { QuestionsNavigationImpl(get(), get()) }
    single<QuestionNavigation> { QuestionNavigationImpl(get()) }
    single<RightAnswerNavigation> { RightAnswerNavigationImpl(get()) }
    single<WrongAnswerNavigation> { WrongAnswerNavigationImpl(get()) }

    //Router
    single<Router> { RouterImpl() }

    //Arguments
    single<QuestionFragmentArguments> { QuestionFragmentArgumentsImpl() }
}