package me.raiden.modular.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.vponamorenko.modular.navigation.router.Router
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val router: Router by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        router.bind(this)
    }

    override fun onPause() {
        super.onPause()
        router.unBind()
    }

    override fun onSupportNavigateUp(): Boolean = router.navigateUp()
}
