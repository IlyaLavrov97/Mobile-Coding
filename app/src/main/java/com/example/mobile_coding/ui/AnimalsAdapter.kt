package com.example.mobile_coding.ui

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
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            CAT_VIEW_TYPE -> {
                CatViewHolder(inflater.inflate(
                    R.layout.item_cat,
                    parent,
                    false
                ), ::onItemClick
                )
            }
            DOG_VIEW_TYPE -> {
                DogViewHolder(inflater.inflate(
                    R.layout.item_dog,
                    parent,
                    false
                ), ::onItemClick
                )
            }
            PARROT_VIEW_TYPE -> {
                ParrotViewHolder(inflater.inflate(
                    R.layout.item_parrot,
                    parent,
                    false
                ), ::onItemClick
                )
            }
            else -> throw ClassNotFoundException()
        }
    }

    private fun onItemClick(position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            clickItemListener(items[position])
        }
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val item = items[position]

        when (holder) {
            is CatViewHolder -> {
                // TODO

                holder.setInfo(item as Cat)
            }
            is DogViewHolder -> {
                // TODO
                holder.setInfo(item as Dog)
            }
            is ParrotViewHolder -> {
                // TODO
                holder.setInfo(item as Parrot)
            }
            else -> throw ClassNotFoundException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Cat -> CAT_VIEW_TYPE
            is Dog -> DOG_VIEW_TYPE
            is Parrot -> PARROT_VIEW_TYPE
            else -> throw ClassNotFoundException()
        }
    }

    companion object {
        private const val CAT_VIEW_TYPE: Int = 1
        private const val DOG_VIEW_TYPE: Int = 2
        private const val PARROT_VIEW_TYPE: Int = 3
    }
}