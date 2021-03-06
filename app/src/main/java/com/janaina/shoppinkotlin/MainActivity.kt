package com.janaina.shoppinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.janaina.shoppinkotlin.models.Products
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.template_category.*
import kotlinx.android.synthetic.main.template_category.view.*
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
            startActivity(intent)
        }

        val bctButton = findViewById<ImageView>(R.id.cart_button)
        bctButton.setOnClickListener {
            val intent = Intent (this, SeventhActivity ::class.java)
            startActivity(intent)
        }

        val infoButton = findViewById<ImageView>(R.id.button_Info)
        infoButton.setOnClickListener {
            val intent = Intent (this, SixthActivity ::class.java)
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