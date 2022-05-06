package com.janaina.shoppinkotlin.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.janaina.shoppinkotlin.PostViewHolder
import com.janaina.shoppinkotlin.R
import com.janaina.shoppinkotlin.models.Products
import com.squareup.picasso.MemoryPolicy
import com.squareup.picasso.Picasso

class ThirdAdapter (private val post: Array<Products>, private val context : Context): RecyclerView.Adapter<PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.template_product,parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentPost = post[position]

        val productName = holder.itemView.findViewById<TextView>(R.id.text_product_name)
        val productPrice = holder.itemView.findViewById<TextView>(R.id.text_product_price)
        val productDescription = holder.itemView.findViewById<TextView>(R.id.text_product_desc)


        val imageView = holder.itemView.findViewById<ImageView>(R.id.imageView)

        imageView.setImageDrawable(AppCompatResources.getDrawable(context,R.drawable.default_product_image))
        val imgUrl = currentPost.image
        Picasso.get()
            .load(imgUrl)
            .memoryPolicy(MemoryPolicy.NO_CACHE)
            .into(imageView)



        productName.text = currentPost.title
        productPrice.text = currentPost.price.toString()
        productDescription.text = currentPost.description



    }


    override fun getItemCount(): Int {
        return post.size
    }
}