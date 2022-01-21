package com.sparrow.cactaceae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv_counter_space = findViewById<TextView>(R.id.tv_counter_space)
        var btn_incr = findViewById<Button>(R.id.btn_incr)
        var btn_decr = findViewById<Button>(R.id.btn_decr)

        btn_incr.setOnClickListener {
            if(count>=0){
                count +=1
                tv_counter_space.text = count.toString()

                Log.i("SKHST_512","$count")
            }
        }

        btn_decr.setOnClickListener {
            if(count>0) {
                count -= 1
                tv_counter_space.text = count.toString()
                Log.i("SKHST_512","$count")
            }
        }

    }

}