package com.ryanhuen.rockkotlindemo.pic

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.ryanhuen.rockkotlindemo.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PicCoroutineActivity : AppCompatActivity() {

    private lateinit var mImageView: ImageView;
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic_coroutine)
        mImageView = findViewById(R.id.image_view);

        coroutineScope.launch(Dispatchers.Main) {
            val drawable: Drawable = getDisplayDrawable()
            mImageView.setImageDrawable(drawable)
        }
    }

    private suspend fun getDisplayDrawable(): Drawable = withContext(Dispatchers.IO) {
        return@withContext Glide.with(this@PicCoroutineActivity).load("https://img.alicdn.com/bao/uploaded/i1/2785922113/O1CN01tPXfmJ1RTnQryU6DG_!!2785922113.jpg_400x400")
                .submit().get();
    }


}
