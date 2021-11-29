package me.yifeiyuan.hf.ui.checkbox

import android.content.Context
import android.util.AttributeSet
import android.widget.CheckBox

/**
 * Created by 程序亦非猿 on 2021/3/30.
 *
 *
 * CheckBox
 */
class MyCheckBox : androidx.appcompat.widget.AppCompatCheckBox {

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {

        
    }

}