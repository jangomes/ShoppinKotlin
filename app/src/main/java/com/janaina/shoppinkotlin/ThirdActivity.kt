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
import com.janaina.shoppinkotlin.Adapters.SecondAdapter
import com.janaina.shoppinkotlin.models.Products
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_secondary.*
import kotlinx.android.synthetic.main.activity_third.*
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        Handler(Looper.getMainLooper()).postDelayed({
            makeRequest()
        }, 1)
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
                            Toast.makeText(this@ThirdActivity, "post completed", Toast.LENGTH_LONG)
                                .show()

                            loading_text3.visibility = View.GONE
                            posts_recycler_view3.visibility = View.VISIBLE
                            posts_recycler_view3.layoutManager = LinearLayoutManager(this@ThirdActivity)
                            posts_recycler_view3.adapter = SecondAdapter(categories, this@ThirdActivity)
                        }

                    } else {
                        Log.i(MAIN_ACTIVITY_LOGKEY, "response code: ${response.code}")
                    }
                }
            })
        }
    }