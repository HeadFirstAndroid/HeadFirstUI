package me.yifeiyuan.hf.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

/**
 */
class MyTextView : androidx.appcompat.widget.AppCompatTextView {

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
        // Load attributes
        
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(text, type)

        text?.let {

            if (text.contains(".")) {

                val index = text.indexOf("0")

                val mainText = text.substring(0, index)

                val subText = text.substring(index, text.length)


            }

        }
    }
}