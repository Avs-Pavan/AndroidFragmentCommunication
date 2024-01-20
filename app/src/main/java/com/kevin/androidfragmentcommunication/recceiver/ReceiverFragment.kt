package com.kevin.androidfragmentcommunication.recceiver

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kevin.androidfragmentcommunication.R

class ReceiverFragment : Fragment() {

    companion object {
        fun newInstance() = ReceiverFragment()
    }


    private lateinit var viewModel: ReceiverViewModel

    private lateinit var messageView: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_receiver, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        messageView = view.findViewById(R.id.receiver)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[ReceiverViewModel::class.java]
        // TODO: Use the ViewModel
    }

    @SuppressLint("SetTextI18n")
    fun onMessageReceived(message: String) {
        messageView.text = "Received: $message"
    }
}