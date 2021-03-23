package me.yifeiyuan.hf.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.yifeiyuan.adh.showcase.AdhShowcaseActivity
import me.yifeiyuan.adh.showcase.AdhShowcaseItem
import me.yifeiyuan.hf.ui.viewpager2.ViewPager2Activity

class MainActivity : AdhShowcaseActivity() {

    override fun provideShowcaseItems(): List<AdhShowcaseItem> {

        return mutableListOf(
            createShowcaseItem("Drawable") {
                startActivity(Intent(this@MainActivity, DrawableActivity::class.java))
            },

            createShowcaseItem("Background") {
                startActivity(Intent(this@MainActivity, BackgroundActivity::class.java))
            },

            createShowcaseItem("ViewPager2 Tab+Fragment") {
                startActivity(Intent(this@MainActivity, ViewPager2Activity::class.java))
            },


            )
    }
}