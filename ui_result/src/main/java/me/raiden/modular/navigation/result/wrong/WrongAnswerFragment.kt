package me.raiden.modular.navigation.result.wrong

import com.me.vponomarenko.modular.navigation.imagebinder.ImageBinder
import me.raiden.modular.navigation.base.BaseFragment
import me.raiden.modular.navigation.result.R
import me.raiden.modular.navigation.result.databinding.FragmentWrongBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class WrongAnswerFragment : BaseFragment<WrongAnswerViewModel, FragmentWrongBinding>() {
    private companion object {
        const val ANDROID_IMAGE = "https://source.android.com/setup/images/Android_greenrobot.png"
        const val IOS_IMAGE =
            "https://cnet3.cbsistatic.com/img/qt1Ts53nLxKXj_u8hLTeQgkhoIo=/370x0/2011/10/05/74df5391-fdc1-11e2-8c7c-d4ae52e62bcc/apple-logo-2.jpg"
    }

    private val imageBinder: ImageBinder by currentScope.inject()
    override val viewModel: WrongAnswerViewModel by currentScope.viewModel(this)
    override val layoutId: Int = R.layout.fragment_wrong

    override fun onCreateView() {
        binding.viewModel = viewModel
        bindAndroid()
        bindIos()
    }

    private fun bindAndroid() {
        imageBinder.setUrl(ANDROID_IMAGE)
        imageBinder.bindIn(binding.androidImage)
    }

    private fun bindIos() {
        imageBinder.setUrl(IOS_IMAGE)
        imageBinder.bindIn(binding.iosImage)
    }
}