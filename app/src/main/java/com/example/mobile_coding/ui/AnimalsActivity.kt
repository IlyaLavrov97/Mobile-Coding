package com.example.mobile_coding.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
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

    //----------------------------------




    //-------------------------------
    private fun itemClick(animal: Animal) {
        val intent = Intent(this, AnimalDetailsActivity::class.java).apply {
        //    putExtra(EXTRA_MESSAGE, animal.getInfo())
            putExtra(EXTRA_MESSAGE2, animal.getInfo() + animal.getAddInfo())
        }
        startActivity(intent)
    }

    companion object {
        const val EXTRA_MESSAGE: String = "EXTRA_MESSAGE"
        const val EXTRA_MESSAGE2: String = "EXTRA_MESSAGE2"
    }
}