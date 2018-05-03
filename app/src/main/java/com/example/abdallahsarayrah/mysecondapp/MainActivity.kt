package com.example.abdallahsarayrah.mysecondapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun show(v: View) {
        var langs = ArrayList<String>()
        if (chk_ar.isChecked) langs.add(chk_ar.text.toString())
        if (chk_en.isChecked) langs.add(chk_en.text.toString())
        if (chk_fr.isChecked) langs.add(chk_fr.text.toString())

        var s = ""
        for (x in langs) s += x + "\n" //this is another way to iterate over arraylist

        textView.text = s
    }
}
