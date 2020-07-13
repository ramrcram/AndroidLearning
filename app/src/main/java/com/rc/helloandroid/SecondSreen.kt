package com.rc.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_sreen.*

class SecondSreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_sreen)
        btnDetails.setOnClickListener {
            var nameEntry =  txtNameEntry.text
            txtNameDisplay.text = "My name is " + nameEntry
        }
    }
}