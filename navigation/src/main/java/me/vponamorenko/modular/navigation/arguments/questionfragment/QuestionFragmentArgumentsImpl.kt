package me.vponamorenko.modular.navigation.arguments.questionfragment

import android.os.Bundle
import me.vponomarenko.modular.navigation.question.QuestionFragment

internal class QuestionFragmentArgumentsImpl :
    QuestionFragmentArguments {
    override fun setQuestionId(questionId: Int): Bundle {
        return QuestionFragment.createBundle(questionId)
    }
}