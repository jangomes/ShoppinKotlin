package com.janaina.shoppinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter (private val context : Context): RecyclerView.Adapter<PostViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.template_category,parent, false)
        return PostViewHolder(view)


    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
      val postContent = holder.itemView.findViewById<TextView>(R.id.text_category)
        postContent.text = "Nothing"
    }

    override fun getItemCount(): Int {
        return 5
    }



}