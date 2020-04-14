package com.example.mobile_coding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobile_coding.R
import com.example.mobile_coding.ui.AnimalsActivity.Companion.ADDITIONAL_INFO_MESSAGE
import com.example.mobile_coding.ui.AnimalsActivity.Companion.MAIN_INFO_MESSAGE
import kotlinx.android.synthetic.main.activity_animal_details.*

class AnimalDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)

        // Get the Intent that started this activity and extract the string
        val mainInfo = intent.getStringExtra(MAIN_INFO_MESSAGE)
        val additionalInfo = intent.getStringExtra(ADDITIONAL_INFO_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        infoTextView.run {
            text = mainInfo
        }

        additionalInfoTextView.run {
            text = additionalInfo
        }
    }
}