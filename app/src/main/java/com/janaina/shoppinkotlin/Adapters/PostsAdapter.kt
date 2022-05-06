package com.janaina.shoppinkotlin.Adapters

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.janaina.shoppinkotlin.PostViewHolder
import com.janaina.shoppinkotlin.R
import com.janaina.shoppinkotlin.SecondaryActivity
import com.janaina.shoppinkotlin.ThirdActivity
import com.janaina.shoppinkotlin.models.Products
import kotlinx.android.synthetic.main.activity_secondary.*


class PostsAdapter (private val categories: Array<Products>, private val context : Context): RecyclerView.Adapter<PostViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.template_category,parent, false)
        return PostViewHolder(view)



    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
      val currentProducts = categories[0]
      val currentProducts2 = categories[5]
      val currentProducts3 = categories[9]
      val currentProducts4 = categories[15]
      val postCategory = holder.itemView.findViewById<TextView>(R.id.text_category)
      val postCategory2 = holder.itemView.findViewById<TextView>(R.id.text_category2)
      val postCategory3 = holder.itemView.findViewById<TextView>(R.id.text_category3)
      val postCategory4 = holder.itemView.findViewById<TextView>(R.id.text_category4)


    //On click para mudar de pagina
        holder.itemView.findViewById<TextView>(R.id.text_category).setOnClickListener {
            val intent = Intent (context,ThirdActivity::class.java)
            startActivity(context, intent, null)
        }

        holder.itemView.findViewById<TextView>(R.id.text_category2).setOnClickListener {
            val intent = Intent (context,ThirdActivity::class.java)
            startActivity(context, intent, null)
        }

        holder.itemView.findViewById<TextView>(R.id.text_category3).setOnClickListener {
            val intent = Intent (context,ThirdActivity::class.java)
            startActivity(context, intent, null)
        }

        holder.itemView.findViewById<TextView>(R.id.text_category4).setOnClickListener {
            val intent = Intent (context,ThirdActivity::class.java)
            startActivity(context, intent, null)
        }


        postCategory.text = currentProducts.category
        postCategory2.text = currentProducts2.category
        postCategory3.text = currentProducts3.category
        postCategory4.text = currentProducts4.category

    }


    override fun getItemCount(): Int {
        return 1

    }




}



