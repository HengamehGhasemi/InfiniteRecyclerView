package com.testProject.giphy.viewHolders

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import com.testProject.giphy.R
import com.testProject.giphy.entity.Giph

class GiphViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder (
    LayoutInflater.from(parent.context).inflate(R.layout.giph_item, parent, false)){

    private var image = itemView.findViewById<ImageView>(R.id.image)
    private val context = parent.context;
    var giph : Giph? = null

    fun bindTo(giph : Giph?) {
        this.giph = giph
        //Picasso.get().load(giph?.embed_url).into(image)
        Glide.with(context).load("https://media4.giphy.com/media/"+giph?.id+"/giphy-downsized.gif").into(image)

    }
}
