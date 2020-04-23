package com.example.mobile_coding.ui

import android.R.array
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
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
            val args = Bundle()
            args.putSerializable(ANIMAL_INFO, animal)
            putExtra(ANIMAL_INFO, args)
        }
        startActivity(intent)
    }

    companion object {
        const val ANIMAL_INFO: String = "ANIMAL_INFO"
    }
}