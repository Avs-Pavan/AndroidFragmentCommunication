package com.kevin.androidfragmentcommunication.fragmentone

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevin.androidfragmentcommunication.R

class FragmentOne : Fragment() {

    companion object {
        fun newInstance() = FragmentOne()
    }

    private lateinit var viewModel: FragmentOneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentOneViewModel::class.java)
        // TODO: Use the ViewModel
    }

}