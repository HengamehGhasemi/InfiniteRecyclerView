package com.testProject.giphy.adapters

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.viewHolders.GiphViewHolder
import java.util.*

class GiphsRecyclerAdapter() : PagedListAdapter<Giph, GiphViewHolder>(diffCallback) {

    private var onItemLongClickListener: OnItemLongClickListener? = null

    override fun onBindViewHolder(holder: GiphViewHolder, position: Int) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : GiphViewHolder {

        return GiphViewHolder(parent)
    }

    companion object {

         val diffCallback = object : DiffUtil.ItemCallback<Giph>() {

            override fun areItemsTheSame(oldItem: Giph, newItem: Giph): Boolean =
                oldItem.id == newItem.id


            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Giph, newItem: Giph): Boolean =
                oldItem == newItem
        }
    }

  /*  interface OnItemLongClickListener<T> {
        fun onItemLongClicked(itemBinder: T, position: Int)
    }
*/
    interface OnItemLongClickListener {
        fun onItemLongClicked(giph: Giph?, position: Int)
    }

    fun setOnItemLongClickListener(itemLongClickListener : OnItemLongClickListener?) {
        onItemLongClickListener = itemLongClickListener
    }

}