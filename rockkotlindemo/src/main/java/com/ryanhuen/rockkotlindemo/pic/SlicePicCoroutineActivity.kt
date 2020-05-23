package com.ryanhuen.rockkotlindemo.pic

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.ryanhuen.rockkotlindemo.R
import kotlinx.coroutines.*

class SlicePicCoroutineActivity : AppCompatActivity() {

    private lateinit var mIvFourPart: ImageView;
    private lateinit var mIvNinePart: ImageView;
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slice_pic_coroutine)
        mIvFourPart = findViewById(R.id.iv_four_part);
        mIvNinePart = findViewById(R.id.iv_nine_part);

        coroutineScope.launch {
            val fourPartDrawable = async { getFourPartDrawable() }
            val ninePartDrawable = async { getNinePartDrawable() }
            showPic(fourPartDrawable.await(), ninePartDrawable.await())
        }
    }

    private fun showPic(fourPartDrawable: Drawable, ninePartDrawable: Drawable) {
        mIvFourPart.setImageDrawable(fourPartDrawable)
        mIvNinePart.setImageDrawable(ninePartDrawable)
    }

    private suspend fun getNinePartDrawable(): Drawable = withContext(Dispatchers.IO) {

        val drawable: Drawable = Glide.with(this@SlicePicCoroutineActivity).load("https://img.alicdn.com/bao/uploaded/i1/2785922113/O1CN01tPXfmJ1RTnQryU6DG_!!2785922113.jpg_400x400")
                .submit().get();
        val bitmap = drawableToBitmap(drawable)
        val realBitmap = getResizeBitmap(bitmap, 2)
        return@withContext BitmapDrawable(resources, realBitmap)
    }

    private suspend fun getFourPartDrawable(): Drawable = withContext(Dispatchers.IO) {
        val drawable: Drawable = Glide.with(this@SlicePicCoroutineActivity).load("https://img.alicdn.com/bao/uploaded/i1/2785922113/O1CN01tPXfmJ1RTnQryU6DG_!!2785922113.jpg_400x400")
                .submit().get();
        val bitmap = drawableToBitmap(drawable)
        val realBitmap = getResizeBitmap(bitmap, 9)
        return@withContext BitmapDrawable(resources, realBitmap)
    }

    private fun getResizeBitmap(bitmap: Bitmap, part: Int): Bitmap {
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.width / part, bitmap.height / part)
    }

    private fun drawableToBitmap(drawable: Drawable): Bitmap {
        val width = drawable.intrinsicWidth
        val height = drawable.intrinsicHeight
        drawable.setBounds(0, 0, width, height);
        val bitmapConfig: Bitmap.Config = Bitmap.Config.ARGB_8888;
        val bitmap = Bitmap.createBitmap(width, height, bitmapConfig)
        val canvas: Canvas = Canvas(bitmap)
        drawable.draw(canvas)
        return bitmap
    }
}
