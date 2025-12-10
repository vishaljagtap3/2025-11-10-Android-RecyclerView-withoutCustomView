package com.aavidsoft.customview02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aavidsoft.customview02.databinding.PostLayoutBinding

class PostsAdapter(
    private val posts : ArrayList<Post>
): RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {

    inner class PostViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val postLayoutBinding : PostLayoutBinding = PostLayoutBinding.bind(view)
    }

    override fun getItemCount(): Int = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.postLayoutBinding.post = posts[position]
    }

}