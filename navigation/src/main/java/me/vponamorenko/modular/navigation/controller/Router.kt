package me.vponamorenko.modular.navigation.controller

import android.app.Activity
import android.os.Bundle
import androidx.annotation.IdRes

interface Router {
    fun bind(activity: Activity)
    fun unBind()
    fun navigate(@IdRes resId: Int)
    fun goBack()
    fun navigate(@IdRes resId: Int, bundle: Bundle)
    fun navigateUp(): Boolean
}