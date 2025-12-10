package com.aavidsoft.customview02

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter(
    private val posts : ArrayList<Post>
): RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {

    inner class PostViewHolder(val postView : PostView) : RecyclerView.ViewHolder(postView)

    override fun getItemCount(): Int = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
           PostView(parent.context)
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.postView.post = posts[position]
    }

}