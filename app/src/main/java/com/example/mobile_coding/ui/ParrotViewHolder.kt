package com.example.mobile_coding.ui

import android.view.View
import com.example.mobile_coding.model.Parrot
import kotlinx.android.synthetic.main.item_parrot.view.*

class ParrotViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    fun bindItem(parrot: Parrot) {
        itemView.run {
            parrotInfoTextView.text = parrot.getInfo()
            parrotWingTextView.text = parrot.getWingDescription()
        }
    }
}