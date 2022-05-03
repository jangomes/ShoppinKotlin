package com.janaina.shoppinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
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

        posts_recycler_view.layoutManager = LinearLayoutManager(this)
        posts_recycler_view.adapter = PostsAdapter(this)


        makeRequest()
    }

    //to add gson

    private fun makeRequest(){

        val url = "https://fakestoreapi.com/products"
        val client = okhttp3.OkHttpClient()
        val request = Request.Builder().url(url).build()
        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                Log.i(MAIN_ACTIVITY_LOGKEY, "it Failed ${e.message}" )
            }

            override fun onResponse(call: Call, response: Response) {
              if (response.isSuccessful && response.body != null){
                  val responseBody = response.body!!.string()
                  Log.i(MAIN_ACTIVITY_LOGKEY, "response received $responseBody" )
              }else{
                  Log.i(MAIN_ACTIVITY_LOGKEY, "response code: ${response.code}" )              }
            }

        })


    }

}