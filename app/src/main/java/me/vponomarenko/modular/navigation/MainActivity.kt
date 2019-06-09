package me.vponomarenko.modular.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.vponamorenko.modular.navigation.controller.NavigationController
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val navigationController: NavigationController by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        navigationController.bind(this)
    }

    override fun onPause() {
        super.onPause()
        navigationController.unBind()
    }

    override fun onSupportNavigateUp(): Boolean = navigationController.navigateUp()
}
