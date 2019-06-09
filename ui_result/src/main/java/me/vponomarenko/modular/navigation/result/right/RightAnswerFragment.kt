package me.vponomarenko.modular.navigation.result.right

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_right.*
import me.vponomarenko.injectionmanager.x.XInjectionManager
import me.vponomarenko.modular.navigation.result.R
import org.koin.android.ext.android.inject

class RightAnswerFragment : Fragment() {

    private val navigation: RightAnswerNavigation by inject()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_right, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_all_questions.setOnClickListener {
            navigation.openAllQuestions()
        }
    }
}