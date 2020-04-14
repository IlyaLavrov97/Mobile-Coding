package com.example.mobile_coding.ui

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot

class AnimalViewHolder
constructor(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun setInfo(info: String) {
        val infoTextView = view.findViewById<TextView>(R.id.infoTextView)
        infoTextView.text = info
    }


    fun setBackgroundColor(animal: Animal) {
        val infoContainer = view.findViewById<ConstraintLayout>(R.id.infoContainer)

        val color = when(animal) {
            is Cat -> Color.GREEN
            is Dog -> Color.BLUE
            is Parrot -> Color.YELLOW
            else -> Color.WHITE
        }

        infoContainer.setBackgroundColor(color)
    }
}
