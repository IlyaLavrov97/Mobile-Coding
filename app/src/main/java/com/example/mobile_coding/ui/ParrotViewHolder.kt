package com.example.mobile_coding.ui

import android.view.View
import android.widget.TextView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Parrot
import kotlinx.android.synthetic.main.item_parrot.view.*

class ParrotViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    // TODO По возможности сделать здесь кастомные поля
    // создать bind методы
    fun setInfo(parrot : Parrot){
        view.parrotTextView1.text = parrot.getInfo()
        view.parrotTextView2.text = parrot.getAdditionalInfo()
    }
}