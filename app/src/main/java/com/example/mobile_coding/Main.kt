package com.example.mobile_coding

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot
import kotlinx.android.synthetic.main.activity_main.*

class Main: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catTextView = findViewById<TextView>(R.id.catTextView)
        val dogTextView = findViewById<TextView>(R.id.dogTextView)
        val parrotTextView = findViewById<TextView>(R.id.parrotTextView)

        var cat = Cat("Felix", 3)
        var dog = Dog("Bob", 4)
        var parrot = Parrot("Kesha", 1)

        catTextView.text = cat.getInfo()
        dogTextView.text = dog.getInfo()
        parrotTextView.text = parrot.getInfo()

    }
}