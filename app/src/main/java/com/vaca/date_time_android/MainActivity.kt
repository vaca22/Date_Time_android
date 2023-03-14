package com.vaca.date_time_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gg= Date()
        val hh = gg.time
        Log.e("gaga",hh.toString())
        val dada = Date(hh)
        if(dada==gg) {
            Log.e("gaga", "yes")
        }
        else{
            Log.e("gaga", "no")
        }
    }
}