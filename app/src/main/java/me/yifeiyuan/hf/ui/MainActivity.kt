package me.yifeiyuan.hf.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.yifeiyuan.adh.showcase.AdhShowcaseActivity
import me.yifeiyuan.adh.showcase.AdhShowcaseItem
import me.yifeiyuan.hf.ui.checkbox.CheckBoxActivity
import me.yifeiyuan.hf.ui.layoutinflater.InflaterActivity
import me.yifeiyuan.hf.ui.progressdialog.ProgressDialogActivity
import me.yifeiyuan.hf.ui.viewpager2.ViewPager2Activity

class MainActivity : AdhShowcaseActivity() {

    override fun provideShowcaseItems(): List<AdhShowcaseItem> {

        return mutableListOf(
            createShowcaseItem("CheckBox") {
                startActivity(Intent(this@MainActivity, CheckBoxActivity::class.java))
            },
            createShowcaseItem("Drawable") {
                startActivity(Intent(this@MainActivity, DrawableActivity::class.java))
            },

            createShowcaseItem("Background") {
                startActivity(Intent(this@MainActivity, BackgroundActivity::class.java))
            },

            createShowcaseItem("ViewPager2——TabLayout+Fragment") {
                startActivity(Intent(this@MainActivity, ViewPager2Activity::class.java))
            },

            createShowcaseItem("ProgressDialog ") {
                startActivity(Intent(this@MainActivity, ProgressDialogActivity::class.java))
            },

            createShowcaseItem("InflaterActivity ") {
                start(InflaterActivity::class.java)
            },

            )
    }

    private fun start(activityClass: Class<*>) {
        startActivity(Intent(this, activityClass))
    }
}