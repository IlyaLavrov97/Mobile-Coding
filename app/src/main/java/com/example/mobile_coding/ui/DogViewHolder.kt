package com.example.mobile_coding.ui

import android.view.View
import com.example.mobile_coding.model.Dog
import kotlinx.android.synthetic.main.item_dog.view.*

class DogViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    fun bindItem(dog: Dog) {
        itemView.run {
            dogTextView.text = dog.getInfo()
        }
    }
}