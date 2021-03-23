package me.yifeiyuan.hf.ui.viewpager2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import me.yifeiyuan.hf.ui.R

/**
 * Created by 程序亦非猿 on 2021/3/23.
 */

private const val TAG = "WithFragmentAdapter"

class WithFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 10
    }

    override fun createFragment(position: Int): Fragment {
        Log.d(TAG, "createFragment() called with: position = $position")
        return HolderFragment().apply {
            arguments = Bundle().apply {
                putInt("index", position)
            }
        }
    }

    override fun onBindViewHolder(
        holder: FragmentViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        Log.d(
            TAG,
            "onBindViewHolder() called with: holder = $holder, position = $position, payloads = $payloads"
        )
        super.onBindViewHolder(holder, position, payloads)
    }

    class HolderFragment : Fragment() {

        var index = 0
        override fun onCreate(savedInstanceState: Bundle?) {
            Log.d(TAG, "onCreate: ${arguments!!.getInt("index")}")
            super.onCreate(savedInstanceState)
            index = arguments!!.getInt("index")
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            Log.d(TAG, "onCreateView: $index")
            return inflater.inflate(R.layout.viewpager2_item_fragment,container,false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            Log.d(TAG, "onViewCreated: $index")
            super.onViewCreated(view, savedInstanceState)
            view.findViewById<TextView>(R.id.text).apply {
                text= "Fragment Position:$index"
            }

        }

        override fun onResume() {
            Log.d(TAG, "onResume() called $index")
            super.onResume()
        }

        override fun onPause() {
            Log.d(TAG, "onPause: $index")
            super.onPause()
        }
    }
}