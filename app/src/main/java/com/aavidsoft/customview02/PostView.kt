package com.aavidsoft.customview02

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.aavidsoft.customview02.databinding.PostLayoutBinding

class PostView(
    context: Context
) : LinearLayout(context){
    private val postLayoutBinding : PostLayoutBinding

    var post : Post? = null
        set(value) {
            field = value
            postLayoutBinding.post = post
        }

    init {
        this.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.400dp)
        val view = LayoutInflater.from(context).inflate(R.layout.post_layout, this, false)
        postLayoutBinding = PostLayoutBinding.bind(view)
    }

}