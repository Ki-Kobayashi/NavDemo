package com.example.navdemo.pages.second

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navdemo.R
import com.example.navdemo.databinding.FragmentSecondBinding

/**
 * Created by K.Kobayashi on 2023/06/24.
 */
class SecondFragment: Fragment(R.layout.fragment_second) {
    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!

    private val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = DataBindingUtil.bind(view)
        binding.textView.text = args.userInputText
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
