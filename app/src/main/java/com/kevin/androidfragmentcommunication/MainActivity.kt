package com.kevin.androidfragmentcommunication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kevin.androidfragmentcommunication.fragmentone.FragmentOne
import com.kevin.androidfragmentcommunication.fragmenttwo.FragmentTwo

class MainActivity : AppCompatActivity() {

    private val replaceButton: FloatingActionButton by lazy {
        findViewById(R.id.replace)
    }

    private val nextScreen: ExtendedFloatingActionButton by lazy {
        findViewById(R.id.screen2)
    }

    private var isInTwo = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load initial fragment
        supportFragmentManager.beginTransaction().add(R.id.host, FragmentOne()).commit()


        // Replace a fragment on click
        replaceButton.setOnClickListener {
            if (isInTwo)
                supportFragmentManager.beginTransaction().replace(R.id.host, FragmentOne()).commit()
            else {
                supportFragmentManager.beginTransaction().replace(R.id.host, FragmentTwo()).commit()
            }
            isInTwo = !isInTwo
        }

        // Navigate to second screen
        nextScreen.setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }
    }
}