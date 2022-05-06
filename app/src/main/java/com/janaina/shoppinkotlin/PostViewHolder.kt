package com.janaina.shoppinkotlin

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PostViewHolder( var v : View) : RecyclerView.ViewHolder(v) {

    fun bind(text_category: String) {
        val postCategory = v.findViewById<TextView>(R.id.text_category)
        postCategory.text = text_category

        v.setOnClickListener {
            var intent = Intent(v.context, SelectCategoryActivity::class.java)
            intent.putExtra("categories", text_category)
            v.context.startActivity(intent)
        }



        fun bind(text_product_name: String) {
            val currentPost = v.findViewById<TextView>(R.id.text_product_name)
                currentPost.text = text_product_name

            v.setOnClickListener {
                var intent = Intent(v.context, SelectCategoryActivity::class.java)
                intent.putExtra("categories", text_product_name)
                v.context.startActivity(intent)
            }

        }

    }
}
