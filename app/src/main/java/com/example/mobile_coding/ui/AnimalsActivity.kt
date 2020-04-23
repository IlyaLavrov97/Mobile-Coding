package com.example.mobile_coding.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Parrot
import com.example.mobile_coding.repository.AnimalsRepository
import com.example.mobile_coding.repository.FakeAnimalsRepository
import kotlinx.android.synthetic.main.activity_animals.*

class AnimalsActivity : AppCompatActivity() {

    lateinit var repository: AnimalsRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals)
        repository = FakeAnimalsRepository()

        animalsRecyclerView.apply {
            adapter = AnimalsAdapter(repository.getAnimals(), ::itemClick)
            layoutManager = LinearLayoutManager(this@AnimalsActivity)
        }
    }

    private fun itemClick(animal: Animal) {
        val intent = Intent(this, AnimalDetailsActivity::class.java).apply {
            putExtra(MAIN_INFO_MESSAGE, animal.getInfo())
            putExtra(ADDITIONAL_INFO_MESSAGE, animal.getAdditionalInfo())
            putExtra(IMAGE_INFO, animal.getImage())

            if (animal is Parrot) {
                putExtra(UNIQUE_INFO, animal.getWingDescription())
            }
        }
        startActivity(intent)
    }

    companion object {
        const val IMAGE_INFO: String = "IMAGE_INFO"
        const val MAIN_INFO_MESSAGE: String = "MAIN_INFO_MESSAGE"
        const val ADDITIONAL_INFO_MESSAGE: String = "ADDITIONAL_INFO_MESSAGE"
        const val UNIQUE_INFO: String = "UNIQUE_INFO"
    }
}