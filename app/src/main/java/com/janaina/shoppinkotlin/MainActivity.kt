package com.janaina.shoppinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
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
        //eu coloquei no content view, mas posso excluir e colocar entre parenteses na primeira linha

       

        Handler(Looper.getMainLooper()).postDelayed({
            makeRequest()
        }, 1)




    }

    //to add gson

    private fun makeRequest(){
        //"https://fakestoreapi.com/products/categories"

        val url = "https://fakestoreapi.com/products"
        val client = okhttp3.OkHttpClient()
        val request = Request.Builder().url(url).build()
        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                Log.e(MAIN_ACTIVITY_LOGKEY, "it Failed ${e.message}" )
            }

            override fun onResponse(call: Call, response: Response) {
                val value = if (response.isSuccessful && response.body != null) {
                    val responseBody = response.body!!.string()
                    val categories = Gson().fromJson(responseBody, Array<Products>::class.java)
                    categories.forEach { Log.i(MAIN_ACTIVITY_LOGKEY, it.toString()) }

                    Handler(Looper.getMainLooper()).post {
                        Toast.makeText(this@MainActivity, "post completed", Toast.LENGTH_LONG)
                            .show()

                        loading_text.visibility = View.GONE
                        posts_recycler_view.visibility = View.VISIBLE
                        posts_recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
                        posts_recycler_view.adapter = PostsAdapter(categories, this@MainActivity)
                    }

                } else {
                    Log.i(MAIN_ACTIVITY_LOGKEY, "response code: ${response.code}")
                }
            }

        })


    }

}