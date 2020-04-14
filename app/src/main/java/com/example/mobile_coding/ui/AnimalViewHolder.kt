package com.example.mobile_coding.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile_coding.R

class AnimalViewHolder
constructor(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun setInfo(info: String) {
        val infoTextView = view.findViewById<TextView>(R.id.infoTextView)
        infoTextView.text = info
    }

    fun colorBackground(clr : Int) {
        val infoTextView = view.findViewById<TextView>(R.id.infoTextView)
        infoTextView.setBackgroundColor(clr)
    }
}