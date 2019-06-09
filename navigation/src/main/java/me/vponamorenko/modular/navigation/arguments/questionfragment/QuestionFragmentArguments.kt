package me.vponamorenko.modular.navigation.arguments.questionfragment

import android.os.Bundle

internal interface QuestionFragmentArguments {
    fun setQuestionId(questionId: Int): Bundle
}