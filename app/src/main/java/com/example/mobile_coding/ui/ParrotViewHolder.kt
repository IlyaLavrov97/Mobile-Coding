package com.example.mobile_coding.ui

import android.view.View
import android.widget.TextView
import com.example.mobile_coding.R
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Parrot

class ParrotViewHolder(
    view: View,
    onClick: (Int) -> Unit
) : AnimalViewHolder(view, onClick) {
    // TODO По возможности сделать здесь кастомные поля
    // создать bind методы
    fun setInfo(parrot : Animal){
        if (parrot !is Parrot) throw ClassNotFoundException()

        val infoTextView1 = view.findViewById<TextView>(R.id.parrotTextView1)
        val infoTextView2 = view.findViewById<TextView>(R.id.parrotTextView2)

        infoTextView1.text = parrot.getInfo()
        infoTextView2.text = parrot.getAdditionalInfo()
    }
}