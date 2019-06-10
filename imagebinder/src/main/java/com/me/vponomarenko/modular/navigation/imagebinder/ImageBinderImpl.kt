package com.me.vponomarenko.modular.navigation.imagebinder

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import java.lang.NullPointerException

class ImageBinderImpl(context: Context) : ImageBinder {
    private var requestManager: RequestManager = Glide.with(context)
    private var requestBuilder: RequestBuilder<Drawable>? = null

    override fun setUrl(url: String) {
        requestBuilder = requestManager.load(url)
    }

    override fun centerCrop() {
        checkUrl()
        requestBuilder = requestBuilder?.centerCrop()
    }

    override fun setPlaceholder(drawableId: Int) {
        checkUrl()
        requestBuilder = requestBuilder?.placeholder(drawableId)
    }

    override fun bindIn(imageView: ImageView) {
        checkUrl()
        requestBuilder?.into(imageView)
    }

    private fun checkUrl() {
        if (requestBuilder == null) {
            throw NullPointerException("Url must be set First!")
        }
    }
}