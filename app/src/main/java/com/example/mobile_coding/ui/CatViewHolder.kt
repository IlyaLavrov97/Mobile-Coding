package com.example.mobile_coding.ui

import android.view.View
import com.bumptech.glide.Glide
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
            Glide
                .with(context)
                .load("https://ichef.bbci.co.uk/news/410/cpsprodpb/12A9B/production/_111434467_gettyimages-1143489763.jpg")
                .centerCrop()
                .into(catImageView)
        }
    }
}