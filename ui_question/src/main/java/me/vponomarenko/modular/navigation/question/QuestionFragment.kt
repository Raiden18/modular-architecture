package me.vponomarenko.modular.navigation.question

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.vponomarenko.modular.navigation.base.BaseFragment
import me.vponomarenko.modular.navigation.question.databinding.FragmentQuestionBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class QuestionFragment : BaseFragment<QuestionViewModel, FragmentQuestionBinding>() {
    companion object {
        const val EXTRA_QUESTION_ID = "me.vponomarenko.modular.navigation.question.id"
        fun createBundle(questionId: Int) = Bundle().apply {
            putInt(EXTRA_QUESTION_ID, questionId)
        }
    }
    override val viewModel: QuestionViewModel by currentScope.viewModel(this)
    override val layoutId: Int = R.layout.fragment_question
    private val questionId: Int by lazy {
        arguments?.getInt(EXTRA_QUESTION_ID) ?: throw IllegalStateException("no questionId")
    }

    override fun onCreateView() {
        binding.viewModel = viewModel
        binding.textQuestion.text = getString(R.string.question, questionId)
    }
}