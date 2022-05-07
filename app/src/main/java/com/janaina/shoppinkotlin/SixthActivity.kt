package com.janaina.shoppinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)


        val bctButton = findViewById<ImageView>(R.id.cart_button)
        bctButton.setOnClickListener {
            val intent = Intent (this, SeventhActivity ::class.java)
            startActivity(intent)
        }


        val userButton = findViewById<ImageView>(R.id.button_User)
        userButton.setOnClickListener {
            val intent = Intent (this, FifthActivity ::class.java)
            startActivity(intent)
        }


        val closeButton = findViewById<ImageView>(R.id.closeButton)
        closeButton.setOnClickListener {

            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

        }
    }
}