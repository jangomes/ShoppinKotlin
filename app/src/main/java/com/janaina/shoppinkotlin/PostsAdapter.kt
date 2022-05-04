package com.janaina.shoppinkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.janaina.shoppinkotlin.models.Products

class PostsAdapter (private val categories: Array<Products>, private val context : Context): RecyclerView.Adapter<PostViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.template_category,parent, false)
        return PostViewHolder(view)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
      val currentProducts = categories[0] //position
      val currentProducts2 = categories[5] //position
      val currentProducts3 = categories[9] //position
      val currentProducts4 = categories[15] //position
      val postCategory = holder.itemView.findViewById<TextView>(R.id.text_category)
      val postCategory2 = holder.itemView.findViewById<TextView>(R.id.text_category2)
      val postCategory3 = holder.itemView.findViewById<TextView>(R.id.text_category3)
      val postCategory4 = holder.itemView.findViewById<TextView>(R.id.text_category4)


        postCategory.text = currentProducts.category
        postCategory2.text = currentProducts2.category
        postCategory3.text = currentProducts3.category
        postCategory4.text = currentProducts4.category




    }


    override fun getItemCount(): Int {
        return 1
    }



}



