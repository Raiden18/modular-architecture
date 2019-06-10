package me.vponamorenko.modular.navigation.di

import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArgumentsImpl
import me.vponamorenko.modular.navigation.router.Router
import me.vponamorenko.modular.navigation.router.RouterImpl
import me.vponamorenko.modular.navigation.navigators.QuestionNavigationImpl
import me.vponamorenko.modular.navigation.navigators.QuestionsNavigationImpl
import me.vponamorenko.modular.navigation.navigators.RightAnswerNavigationImpl
import me.vponamorenko.modular.navigation.navigators.WrongAnswerNavigationImpl
import me.vponomarenko.modular.navigation.question.QuestionNavigation
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation
import me.vponomarenko.modular.navigation.result.right.RightAnswerNavigation
import me.vponomarenko.modular.navigation.result.wrong.WrongAnswerNavigation
import org.koin.dsl.module

val navigationModule = module {
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