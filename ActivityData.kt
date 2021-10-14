package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityData : AppCompatActivity() {
    companion object{
        const val EXTRA_WEIGHT ="extra_weight"
        const val EXTRA_NAME = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data2)

        val tvData: TextView= findViewById(R.id.tvActivityData)

        val weight = intent.getIntExtra(EXTRA_WEIGHT, 0)
        val name = intent.getStringExtra(EXTRA_NAME)

        val  text = "Nama : $name, \nBerat : $weight Kg"
        tvData.text =text
    }
}