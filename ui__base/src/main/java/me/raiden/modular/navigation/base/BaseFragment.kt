package me.raiden.modular.navigation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment<V : ViewModel, D : ViewDataBinding> : Fragment() {
    abstract val viewModel: V
    abstract val layoutId: Int
    lateinit var binding: D

    abstract fun onCreateView()

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = this
        onCreateView()
        return binding.root
    }

}