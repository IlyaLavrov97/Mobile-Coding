package com.example.mobile_coding.ui

import android.view.View
import android.widget.TextView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Dog
import kotlinx.android.synthetic.main.item_dog.view.*

class DogViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    // TODO По возможности сделать здесь кастомные поля
    // создать bind методы
    fun setInfo(dog : Animal){
        if (dog !is Dog) throw ClassNotFoundException()

        val infoTextView = view.findViewById<TextView>(R.id.dogTextView)
        infoTextView.text = dog.getAdditionalInfo()
    }
}