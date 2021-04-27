package com.washingtoncodelab.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
/*    var increamentButton : Button = findViewById(R.id.incrementButton)
    var incrementText : TextView =findViewById(R.id.displayTextView)*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  incrementNumber = 0

    val incrementButton = findViewById<Button>(R.id.incrementButton)

    incrementButton.setOnClickListener {
            incrementNumber ++
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        displayTextView.text = incrementNumber.toString()
        }
    }
}