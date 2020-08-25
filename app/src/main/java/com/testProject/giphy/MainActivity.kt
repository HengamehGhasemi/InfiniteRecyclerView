package com.testProject.giphy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giphy.sdk.ui.Giphy

class MainActivity : AppCompatActivity() {

    private val API_KEY : String = "oxhH1vEFJ5z99rPvSULUzMRLCmS2lnIN";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Giphy.configure(this, API_KEY)
        setContentView(R.layout.activity_main)
    }
}