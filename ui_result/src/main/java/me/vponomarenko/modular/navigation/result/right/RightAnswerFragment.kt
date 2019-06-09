package me.vponomarenko.modular.navigation.result.right

import me.vponomarenko.modular.navigation.base.BaseFragment
import me.vponomarenko.modular.navigation.result.R
import me.vponomarenko.modular.navigation.result.databinding.FragmentRightBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class RightAnswerFragment : BaseFragment<RightAnswerViewModel, FragmentRightBinding>() {
    override val viewModel: RightAnswerViewModel by currentScope.viewModel(this)
    override val layoutId = R.layout.fragment_right

    override fun onCreateView() {
        binding.viewModel = viewModel
    }
}