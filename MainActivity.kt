package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPindahActivity: Button = findViewById(R.id.btnPindahActivity)
        btnPindahActivity.setOnClickListener(this)

        val btnActivityData: Button = findViewById(R.id.btnActivityData)
        btnActivityData.setOnClickListener(this)

        val btnPhone: Button = findViewById(R.id.btnPhone)
        btnPhone.setOnClickListener(this)

        val btnBrowser: Button = findViewById(R.id.btnBrowser)
        btnBrowser.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnPindahActivity -> {
                val moveActivity = Intent(this, ActivityBaru::class.java)
            startActivity(moveActivity)
            }
            R.id.btnActivityData -> {
                val moveData= Intent(this, ActivityData::class.java)
                moveData.putExtra(ActivityData.EXTRA_NAME, "Dzikrillah Sukma Pamungkas")
                moveData.putExtra(ActivityData.EXTRA_WEIGHT, 60)
                startActivity(moveData)
            }
            R.id.btnPhone-> {
                val phoneNumber = "082278472971"
                val dialPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhone)
            }
            R.id.btnBrowser -> {
                val url= "https://www.polije.ac.id/"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }
        }

    }
}