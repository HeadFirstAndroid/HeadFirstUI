package me.yifeiyuan.hf.ui.viewpager2

import android.os.Bundle
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
class WithFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 10;
    }

    override fun createFragment(position: Int): Fragment {
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
        super.onBindViewHolder(holder, position, payloads)
    }

    class HolderFragment : Fragment() {

        var index = 0
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            index = arguments!!.getInt("index")
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.viewpager2_item_fragment,container,false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            view.findViewById<TextView>(R.id.text).apply {
                text= "Fragment Position:$index"
            }

        }

    }
}