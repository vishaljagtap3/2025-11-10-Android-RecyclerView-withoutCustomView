package com.aavidsoft.customview02

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

data class Post(
    val id : Int,
    val title : String,
    val description: String,
    val imageUrl : String?
)

@BindingAdapter("image_url")
fun setImageUrl(imageView : ImageView, url : String?) {
    Log.e("tag", "Loading: $url")

    Glide.with(imageView.context)
        .load(url)
        .error(R.mipmap.ic_launcher)
        .into(imageView)

}