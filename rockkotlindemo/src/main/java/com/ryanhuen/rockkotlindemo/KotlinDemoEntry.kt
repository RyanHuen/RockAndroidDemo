package com.ryanhuen.rockkotlindemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ryanhuen.rockkotlindemo.pic.PicCoroutineActivity
import com.ryanhuen.rockkotlindemo.pic.SlicePicCoroutineActivity

class KotlinDemoEntry : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_demo_entry)
        findViewById<Button>(R.id.couroutine_thread_name).setOnClickListener {
            CoroutineThreadDemo.main();
        }
        findViewById<Button>(R.id.couroutine_pic).setOnClickListener {
            startActivity(Intent(this, PicCoroutineActivity::class.java))
        }
        findViewById<Button>(R.id.couroutine_slice_pic).setOnClickListener {
            startActivity(Intent(this, SlicePicCoroutineActivity::class.java))
        }
    }
}
