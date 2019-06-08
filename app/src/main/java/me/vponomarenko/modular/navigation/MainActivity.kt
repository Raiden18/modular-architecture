package me.vponomarenko.modular.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import me.vponomarenko.modular.navigation.navigation.controller.NavigationController
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val navigationController: NavigationController by inject()
    private val activityNavController by lazy {
        findNavController(R.id.nav_host_fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        navigationController.bind(activityNavController)
    }

    override fun onPause() {
        super.onPause()
        navigationController.unBind()
    }

    override fun onSupportNavigateUp(): Boolean = activityNavController.navigateUp()
}
