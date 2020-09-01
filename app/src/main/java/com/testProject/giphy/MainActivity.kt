package com.testProject.giphy


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding.widget.RxTextView
import com.testProject.giphy.adapters.GiphsRecyclerAdapter
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.entity.WishGiph
import com.testProject.giphy.helpers.Config
import com.testProject.giphy.repositories.GiphSearchRepositories
import com.testProject.giphy.viewModels.GetAllGiphsViewModel
import com.testProject.giphy.viewModels.WishListViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : GiphsRecyclerAdapter
    val myViewModel by viewModels<GetAllGiphsViewModel>()
    val wishViewModel by viewModels<WishListViewModel>()
    var searchString : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val myViewModel by viewModels<MyViewModel>()
        var recycler : RecyclerView = findViewById<RecyclerView>(R.id.recycler)
        adapter = GiphsRecyclerAdapter()
        recycler.layoutManager = GridLayoutManager(this, 4)
        recycler.adapter = adapter
        myViewModel.giphyes?.observe(this) {
           if (searchString.equals("") || searchString == null){
                    adapter.submitList(it)
                }

           progressBar.visibility = View.GONE
        }


        adapter.setOnItemLongClickListener(object : GiphsRecyclerAdapter.OnItemLongClickListener {
            override fun onItemLongClicked(giph: Giph?, position: Int) {
                var wishgGiph = WishGiph(giph!!.id,giph.type!!,giph.url!!,giph.embed_url!!,giph.title!!)
                wishViewModel.insertAData(wishgGiph)
            }
        })

        RxTextView.textChanges(searchInput)
            .debounce(1, TimeUnit.SECONDS)
            .subscribe { textChanged ->
                Config.serachString = textChanged.toString()
                GiphSearchRepositories.serach(myViewModel, Config.serachString)
                dismissKeyboard()
             }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()

        if (id == R.id.wish_list) {
            val intent = Intent(this, WishList::class.java)
            startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)

    }

    fun dismissKeyboard() {
        val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(searchInput.windowToken, 0)
    }
}