package com.example.mobile_coding.ui

import android.view.View
import com.bumptech.glide.Glide
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Dog
import kotlinx.android.synthetic.main.item_dog.view.*

class DogViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    fun bindItem(dog: Dog) {
        itemView.run {
            dogTextView.text = dog.getInfo()
            dogAdditionalTextView.text = dog.getAdditionalInfo()

            Glide
                .with(context)
                .load(dog.imageUrl)
                .centerCrop()
                .placeholder(R.drawable.img_dog)
                .into(dogImageView)
        }
    }
}