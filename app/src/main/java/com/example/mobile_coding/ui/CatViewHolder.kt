package com.example.mobile_coding.ui

import android.view.View
import com.example.mobile_coding.model.Cat
import kotlinx.android.synthetic.main.item_cat.view.*

class CatViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    fun bindItem(cat: Cat) {
        itemView.run {
            catTextView.text = cat.getInfo()
            catAdditionalInfoTextView.text = cat.getAdditionalInfo()
        }
    }
}