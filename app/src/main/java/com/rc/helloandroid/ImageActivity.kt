package com.rc.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType

import kotlinx.android.synthetic.main.activity_image.*
import kotlinx.android.synthetic.main.activity_second_sreen.*

class ImageActivity : AppCompatActivity() {
    var flag = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        btnShowPassword.setOnClickListener {
            editTextTextPassword2.inputType = InputType.TYPE_CLASS_TEXT
            if(flag == 0){
                imageView2.setImageResource(R.drawable.milky_way_2);
                flag = 1
            }else{
                imageView2.setImageResource(R.drawable.milky_way);
                flag = 0
            }

        }

        
        imageView2.scaleType = ImageView.ScaleType.FIT_XY
    }
}