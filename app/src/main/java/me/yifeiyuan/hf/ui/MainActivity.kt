package me.yifeiyuan.hf.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.yifeiyuan.adh.showcase.AdhShowcaseActivity
import me.yifeiyuan.adh.showcase.AdhShowcaseItem

class MainActivity : AdhShowcaseActivity() {

    override fun provideShowcaseItems(): List<AdhShowcaseItem> {

        return mutableListOf(
                createShowcaseItem("Drawable"){
                    startActivity(Intent(this@MainActivity,DrawableActivity::class.java))
                }

        )
    }
}