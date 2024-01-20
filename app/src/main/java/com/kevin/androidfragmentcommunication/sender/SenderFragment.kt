package com.kevin.androidfragmentcommunication.sender

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.button.MaterialButton
import com.kevin.androidfragmentcommunication.Communicator
import com.kevin.androidfragmentcommunication.R
import kotlin.random.Random

class SenderFragment : Fragment() {

    private lateinit var communicator: Communicator

    override fun onAttach(context: Context) {
        super.onAttach(context)
        communicator = context as Communicator
    }
    companion object {
        fun newInstance() = SenderFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sender, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<MaterialButton>(R.id.sendBtn).setOnClickListener {
            communicator.sendMessage(Random.nextInt().toString())
        }

    }

}