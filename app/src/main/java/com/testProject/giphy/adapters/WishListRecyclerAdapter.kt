package com.testProject.giphy.adapters

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.entity.WishGiph
import com.testProject.giphy.viewHolders.GiphViewHolder
import com.testProject.giphy.viewHolders.WishItemViewHolder
import java.util.*

class WishListRecyclerAdapter() : PagedListAdapter<WishGiph,WishItemViewHolder>(diffCallback) {

    private var onItemLongClickListener: OnItemLongClickListener? = null

   override fun onBindViewHolder(holder: WishItemViewHolder, position: Int) {
        if (getItem(position) != null) {
            holder.bindTo(getItem(position))
        }
        holder.itemView.setOnLongClickListener {
            if (onItemLongClickListener != null) {
                onItemLongClickListener?.onItemLongClicked(getItem(position), position)
            }
            false
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : WishItemViewHolder {

        return WishItemViewHolder(parent)
    }

    companion object {

         val diffCallback = object : DiffUtil.ItemCallback<WishGiph>() {

            override fun areItemsTheSame(oldItem: WishGiph, newItem: WishGiph): Boolean =
                oldItem.id == newItem.id


            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: WishGiph, newItem: WishGiph): Boolean =
                oldItem == newItem
        }
    }

    interface OnItemLongClickListener {
        fun onItemLongClicked(giph: WishGiph?, position: Int)
    }

    fun setOnItemLongClickListener(itemLongClickListener : OnItemLongClickListener?) {
        onItemLongClickListener = itemLongClickListener
    }

}