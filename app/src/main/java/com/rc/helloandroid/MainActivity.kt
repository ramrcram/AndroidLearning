package com.rc.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnChangeText.setOnClickListener {
            //var intentSecondScreen = Intent(this, SecondSreen::class.java).apply {}
            var intentImageScreen = Intent(this, ImageActivity::class.java).apply {}
            startActivity(intentImageScreen)
        }
    }

    fun changeText(){
        txtHello.text = "Hello Ramesh!"
    }
    fun changeTextWithParam(printText:String){
        txtHello.text = printText
    }
}