package com.example.mobile_coding.ui

import android.view.View
import android.widget.TextView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import kotlinx.android.synthetic.main.item_cat.view.*

class CatViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    // TODO По возможности сделать здесь кастомные поля
    // создать bind методы
    fun setInfo(cat : Cat){
        view.catTextView.text = cat.getInfo()
    }
}