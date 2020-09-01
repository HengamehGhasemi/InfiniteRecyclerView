package com.testProject.giphy


import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testProject.giphy.adapters.GiphsRecyclerAdapter

class MainActivity : AppCompatActivity() {

    //private lateinit var myViewModel : MyViewModel
    private lateinit var adapter : GiphsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myViewModel by viewModels<MyViewModel>()
        var recycler : RecyclerView = findViewById<RecyclerView>(R.id.recycler)
        adapter = GiphsRecyclerAdapter()
        recycler.layoutManager = GridLayoutManager(this, 4)
        recycler.adapter = adapter
        myViewModel.giphyes?.observe(this) {
                adapter.submitList(it)
        }

     /*   searchInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) = Unit

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })*/
    }



    /*fun dismissKeyboard() {
        val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(searchInput.windowToken, 0)
    }*/

}