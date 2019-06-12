package me.raiden.modular.navigation.questions

import me.raiden.modular.navigation.base.BaseFragment
import me.raiden.modular.navigation.questions.databinding.FragmentQuestionsBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class QuestionsFragment : BaseFragment<QuestionsViewModel, FragmentQuestionsBinding>() {
    override val viewModel: QuestionsViewModel by currentScope.viewModel(this)
    override val layoutId = R.layout.fragment_questions

    override fun onCreateView() {
        binding.viewModel = viewModel
    }
}