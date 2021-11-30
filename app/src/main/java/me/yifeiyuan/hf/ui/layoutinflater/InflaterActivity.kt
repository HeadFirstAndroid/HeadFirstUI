package me.yifeiyuan.hf.ui.layoutinflater

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder
import me.yifeiyuan.hf.ui.R

class InflaterActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "InflaterActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inflater)
    }


    override fun onResume() {
        super.onResume()

        val layoutInflaterActivity1 = layoutInflater;
        Log.d(TAG, "onResume: $layoutInflaterActivity1")

        val inflaterActivityContext1 = LayoutInflater.from(this)
        val inflaterActivityContext2 = LayoutInflater.from(this)

        Log.d(TAG, "onResume: inflaterActivityContext1 : $inflaterActivityContext1")
        Log.d(TAG, "onResume: inflaterActivityContext2 : $inflaterActivityContext2")

        val inflaterApplicationContext1 = LayoutInflater.from(applicationContext)
        val inflaterApplicationContext2 = LayoutInflater.from(applicationContext)

        Log.d(TAG, "onResume: inflaterApplicationContext1 : $inflaterApplicationContext1")
        Log.d(TAG, "onResume: inflaterApplicationContext2 : $inflaterApplicationContext2")
    }
}