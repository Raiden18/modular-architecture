package me.raiden.modular.navigation.result.right

import me.raiden.modular.navigation.base.BaseFragment
import me.raiden.modular.navigation.result.R
import me.raiden.modular.navigation.result.databinding.FragmentRightBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class RightAnswerFragment : BaseFragment<RightAnswerViewModel, FragmentRightBinding>() {
    override val viewModel: RightAnswerViewModel by currentScope.viewModel(this)
    override val layoutId = R.layout.fragment_right

    override fun onCreateView() {
        binding.viewModel = viewModel
    }
}