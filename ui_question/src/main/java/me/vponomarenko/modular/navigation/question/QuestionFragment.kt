package me.vponomarenko.modular.navigation.question

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.vponomarenko.modular.navigation.question.databinding.FragmentQuestionBinding
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class QuestionFragment : Fragment() {
    companion object {
        private const val EXTRA_QUESTION_ID = "me.vponomarenko.modular.navigation.question.id"
        fun createBundle(questionId: Int) =
            Bundle().apply {
                putInt(EXTRA_QUESTION_ID, questionId)
            }
    }

    private val questionViewModel: QuestionViewModel by currentScope.viewModel(this)
    private val questionId: Int by lazy {
        arguments?.getInt(EXTRA_QUESTION_ID) ?: throw IllegalStateException("no questionId")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentQuestionBinding.inflate(inflater, container, false)
        binding.viewModel = questionViewModel
        binding.lifecycleOwner = this
        binding.textQuestion.text = getString(R.string.question, questionId)
        return binding.root
    }
}