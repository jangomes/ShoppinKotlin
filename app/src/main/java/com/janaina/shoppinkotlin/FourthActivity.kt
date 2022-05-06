package com.janaina.shoppinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.janaina.shoppinkotlin.Adapters.ThirdAdapter
import com.janaina.shoppinkotlin.models.Products
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_fourth.loading_text4
import kotlinx.android.synthetic.main.activity_secondary.*
import kotlinx.android.synthetic.main.activity_third.*
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        Handler(Looper.getMainLooper()).postDelayed({

        }, 1)
        makeRequest()
    }

    private fun makeRequest(){


        val url = "https://fakestoreapi.com/products"
        val client = okhttp3.OkHttpClient()
        val request = Request.Builder().url(url).build()
        client.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e(MAIN_ACTIVITY_LOGKEY, "it Failed ${e.message}" )
            }
            override fun onResponse(call: Call, response: Response) {
                val value = if (response.isSuccessful && response.body != null) {
                    val responseBody = response.body!!.string()
                    val categories = Gson().fromJson(responseBody, Array<Products>::class.java)
                    categories.forEach { Log.i(MAIN_ACTIVITY_LOGKEY, it.toString()) }

                    Handler(Looper.getMainLooper()).post {
                        Toast.makeText(this@FourthActivity, "post completed", Toast.LENGTH_LONG)
                            .show()

                        loading_text4.visibility = View.GONE
                        posts_recycler_view4.visibility = View.VISIBLE
                        posts_recycler_view4.layoutManager = LinearLayoutManager(this@FourthActivity)
                        posts_recycler_view4.adapter = ThirdAdapter(categories, this@FourthActivity)
                    }

                } else {
                    Log.i(MAIN_ACTIVITY_LOGKEY, "response code: ${response.code}")
                }
            }
        })
    }
}
