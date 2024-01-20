package com.kevin.androidfragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevin.androidfragmentcommunication.recceiver.ReceiverFragment
import com.kevin.androidfragmentcommunication.sender.SenderFragment

class ActivityTwo : AppCompatActivity(),Communicator {

    private val sender = SenderFragment.newInstance()
    private val receiver = ReceiverFragment.newInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        supportFragmentManager.apply {
            beginTransaction().add(R.id.sender, sender).commit()
            beginTransaction().add(R.id.receiver, receiver).commit()
        }
    }

    override fun sendMessage(message: String) {
        receiver.onMessageReceived(message)
    }
}