package com.example.mobile_coding.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class AnimalViewHolder
constructor(
    private val view: View,
    private val onClick: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {

    init {
        itemView.setOnClickListener {
            onClick(adapterPosition)
        }
    }
}
