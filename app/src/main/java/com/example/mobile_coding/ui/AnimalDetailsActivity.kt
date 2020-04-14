package com.example.mobile_coding.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobile_coding.R
import com.example.mobile_coding.ui.AnimalsActivity.Companion.EXTRA_MESSAGE
import com.example.mobile_coding.ui.AnimalsActivity.Companion.EXTRA_MESSAGE2

class AnimalDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val message2 = intent.getStringExtra(EXTRA_MESSAGE2)


        // Capture the layout's TextView and set the string as its text
        findViewById<TextView>(R.id.infoTextView).run {
            text = message
        }
        findViewById<TextView>(R.id.addText).run {
            text = message2
        }
    }
}