package com.testProject.giphy

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.giphy.sdk.ui.Giphy
import com.giphy.sdk.ui.pagination.GPHContent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private val API_KEY : String = "oxhH1vEFJ5z99rPvSULUzMRLCmS2lnIN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Giphy.configure(this, API_KEY)
        setContentView(R.layout.activity_main)



        searchInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) = Unit

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })
    }



    fun dismissKeyboard() {
        val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(searchInput.windowToken, 0)
    }

}