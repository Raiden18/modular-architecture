package me.vponomarenko.modular.navigation

import android.app.Application
import me.vponamorenko.modular.navigation.di.navigationModule
import me.vponomarenko.modular.navigation.data.di.remoteDataSourcesModule
import me.vponomarenko.modular.navigation.data.di.repositoriesModule
import me.vponomarenko.modular.navigation.question.questionModule
import me.vponomarenko.modular.navigation.questions.questionsModule
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
                    questionsModule
                )
            )
            androidContext(this@NavApplication)
        }
    }
}