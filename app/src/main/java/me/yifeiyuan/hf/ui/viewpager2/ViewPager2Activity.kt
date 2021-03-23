package me.yifeiyuan.hf.ui.viewpager2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import me.yifeiyuan.hf.ui.R
import me.yifeiyuan.hf.ui.databinding.ActivityViewPager2Binding

/**
 *
 * ViewPager2
 *
 */
private const val TAG = "ViewPager2Activity"

class ViewPager2Activity : AppCompatActivity() {

    lateinit var binding: ActivityViewPager2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pager.adapter = WithFragmentAdapter(this)

        TabLayoutMediator(binding.tabs, binding.pager, true, true) { tab, position ->
            Log.d(TAG, "onCreate: $tab,$position")
            tab.text = "Position:$position"
        }.attach()
    }
}