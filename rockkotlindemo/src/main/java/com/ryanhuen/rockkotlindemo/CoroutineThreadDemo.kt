package com.ryanhuen.rockkotlindemo

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object CoroutineThreadDemo {

    fun main() {

        val coroutineScope = CoroutineScope(Dispatchers.IO)
        coroutineScope.launch {
            Log.d("MuXi", "Current Thread Name(should be io) : " + Thread.currentThread().name)
            Thread.sleep(1000)
            coroutineScope.launch(Dispatchers.Main) {
                Log.d("MuXi", "Current Thread Name(should bo Main) : " + Thread.currentThread().name)
            }
        }
    }

}
