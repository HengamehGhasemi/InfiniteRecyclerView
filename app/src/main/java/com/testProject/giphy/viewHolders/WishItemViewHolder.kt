package com.testProject.giphy.viewHolders

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.squareup.picasso.Picasso
import com.testProject.giphy.R
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.entity.WishGiph
import com.testProject.giphy.viewModels.GetAllGiphsViewModel
import com.testProject.giphy.viewModels.WishListViewModel
import javax.sql.DataSource

class WishItemViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder (
    LayoutInflater.from(parent.context).inflate(R.layout.giph_item, parent, false)){

    private var image = itemView.findViewById<ImageView>(R.id.image)
    private var imageLoading = itemView.findViewById<ImageView>(R.id.loadingImage)
    private val context = parent.context;

    var wishGiph : WishGiph? = null
    fun bindTo(wishGiph : WishGiph?) {
        this.wishGiph = wishGiph
        //Picasso.get().load(giph?.embed_url).into(image)
        Glide.with(context).load(R.drawable.rapid_radiant_bug).into(imageLoading)
        Glide.with(context).load("https://media4.giphy.com/media/"+wishGiph?.id+"/giphy-downsized.gif").listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                p0: GlideException?,
                p1: Any?,
                target: Target<Drawable>?,
                p3: Boolean
            ): Boolean {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                imageLoading.visibility = View.VISIBLE
            }
            override fun onResourceReady(
                p0: Drawable?,
                p1: Any?,
                target: Target<Drawable>?,
                dataSource: com.bumptech.glide.load.DataSource?,
                p4: Boolean
            ): Boolean {
                image.setImageResource(R.drawable.rapid_radiant_bug)
                imageLoading.visibility = View.GONE
                //do something when picture already loaded
                return false
            }
        }).into(image)
    }
}
