package com.testProject.giphy.adapters

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.testProject.giphy.viewHolders.GiphViewHolder
import com.testProject.giphy.entity.Giph

class GiphsRecyclerAdapter() : PagedListAdapter<Giph, GiphViewHolder> (diffCallback) {
    override fun onBindViewHolder(holder: GiphViewHolder, position: Int) {
        if (getItem(position) != null) {
            holder.bindTo(getItem(position))
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
}