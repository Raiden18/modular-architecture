package me.vponamorenko.modular.navigation.router

import android.app.Activity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import me.vponamorenko.modular.navigation.question.R

internal class RouterImpl : Router {
    private var navController: NavController? = null

    override fun navigate(resId: Int, bundle: Bundle) {
        navController?.navigate(resId, bundle)
    }

    override fun navigate(resId: Int) {
        navController?.navigate(resId)
    }

    override fun goBack() {
        navController?.popBackStack()
    }

    override fun bind(activity: Activity) {
        this.navController = findNavController(activity, R.id.nav_host_fragment)
    }

    override fun navigateUp(): Boolean {
        return navController?.navigateUp()!!
    }

    override fun unBind() {
        navController = null
    }
}