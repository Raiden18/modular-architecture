package me.vponomarenko.modular.navigation.result.wrong

import me.vponomarenko.modular.navigation.base.BaseFragment
import me.vponomarenko.modular.navigation.result.R
import me.vponomarenko.modular.navigation.result.databinding.FragmentWrongBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class WrongAnswerFragment : BaseFragment<WrongAnswerViewModel, FragmentWrongBinding>() {
    override val viewModel: WrongAnswerViewModel by currentScope.viewModel(this)
    override val layoutId: Int = R.layout.fragment_wrong

    override fun onCreateView() {
        binding.viewModel = viewModel
    }
}