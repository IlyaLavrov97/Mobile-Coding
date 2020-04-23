package com.example.mobile_coding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Parrot
import com.example.mobile_coding.ui.AnimalsActivity.Companion.ANIMAL_INFO
import kotlinx.android.synthetic.main.activity_animal_details.*

class AnimalDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)

        val bundle = intent.getBundleExtra(ANIMAL_INFO)
        val animal = bundle?.getSerializable(ANIMAL_INFO) as Animal

        animalImageVew.run {
            Glide
                .with(context)
                .load(animal.imageUrl)
                .centerCrop()
                .placeholder(R.drawable.img_cat)
                .into(this)
        }

        infoTextView.run {
            text = animal.getInfo()
        }

        additionalInfoTextView.run {
            text = animal.getAdditionalInfo()
        }

        uniqueInfoTextView.run {
            text = when(animal) {
                is Parrot -> animal.getWingDescription()
                else -> ""
            }
        }
    }
}