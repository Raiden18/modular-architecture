package me.raiden.modular.navigation

import android.app.Application
import me.vponamorenko.modular.navigation.di.navigationModule
import me.raiden.modular.navigation.data.di.remoteDataSourcesModule
import me.raiden.modular.navigation.data.di.repositoriesModule
import me.raiden.modular.navigation.question.questionModule
import me.raiden.modular.navigation.questions.questionsModule
import me.raiden.modular.navigation.result.right.rightAnswerViewModel
import me.raiden.modular.navigation.result.wrong.wrongAnswerViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NavApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            modules(
                listOf(
                    navigationModule,
                    questionModule,
                    remoteDataSourcesModule,
                    repositoriesModule,
                    questionsModule,
                    rightAnswerViewModel,
                    wrongAnswerViewModel
                )
            )
            androidContext(this@NavApplication)
        }
    }
}