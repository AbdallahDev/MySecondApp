package com.example.abdallahsarayrah.mysecondapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_image.*
import kotlinx.android.synthetic.main.activity_image_act1.*

class ImageAct1 : AppCompatActivity() {
    var b = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_act1)
    }

    fun imageChange(v: View) {
        if (b == 0) {
            imageView2.setImageResource(R.drawable.b)
            b = 1
        } else {
            imageView2.setImageResource(R.drawable.a)
            b = 0
        }
    }
}
