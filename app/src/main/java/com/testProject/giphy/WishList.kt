package com.testProject.giphy

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testProject.giphy.adapters.GiphsRecyclerAdapter
import com.testProject.giphy.adapters.WishListRecyclerAdapter
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.entity.WishGiph
import com.testProject.giphy.viewModels.GetAllGiphsViewModel
import com.testProject.giphy.viewModels.WishListViewModel

class WishList : AppCompatActivity() {
    private lateinit var adapter : WishListRecyclerAdapter
    val wishViewModel by viewModels<WishListViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish_list)
        setTitle("Wish List")
        var recycler : RecyclerView = findViewById<RecyclerView>(R.id.recycler)
        adapter = WishListRecyclerAdapter()
        recycler.layoutManager = GridLayoutManager(this, 4)
        recycler.adapter = adapter
        wishViewModel.wishList?.observe(this) {
                adapter.submitList(it)
        }

        adapter.setOnItemLongClickListener(object : WishListRecyclerAdapter.OnItemLongClickListener {

            override fun onItemLongClicked(giph: WishGiph?, position: Int) {
                wishViewModel.DeletAData(giph!!)
                toast(this@WishList)
            }
        })
    }

    fun toast(context: Context) {
        Toast.makeText(context, "Giph removed to wish list", Toast.LENGTH_SHORT).show()
    }
}