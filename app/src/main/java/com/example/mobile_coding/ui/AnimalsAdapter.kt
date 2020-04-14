package com.example.mobile_coding.ui

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot

class AnimalsAdapter
constructor(
    private val items: List<Animal>,
    private val clickItemListener: (Animal) -> Unit
) : RecyclerView.Adapter<AnimalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val viewHolder = AnimalViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_animal,
                parent,
                false
            )
        )
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                clickItemListener(items[position])
            }
        }
        return viewHolder
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.setInfo(items[position].getInfo())

        when (items[position]){
            is Cat -> holder.colorBackground(Color.GREEN)
            is Dog -> holder.colorBackground(Color.BLUE)
            is Parrot -> holder.colorBackground(Color.YELLOW)
            else -> holder.colorBackground(Color.WHITE)
        }
    }
}