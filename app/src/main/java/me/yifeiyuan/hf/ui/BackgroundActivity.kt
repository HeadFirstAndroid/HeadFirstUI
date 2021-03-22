package me.yifeiyuan.hf.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class BackgroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)
    }

    fun onClick(view: View) {
        val r = Random.nextInt() % 2 == 0
        findViewById<View>(R.id.parent).setBackgroundResource(if(r) R.drawable.home_login_guide_bg else R.drawable.home_login_compressed_bg)
    }
}