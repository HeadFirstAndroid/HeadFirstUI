package me.yifeiyuan.hf.ui.progressdialog

import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.yifeiyuan.hf.ui.R

class ProgressDialogActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "ProgressDialogActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_dialog)

        MyProgressDialog(this).show()
    }

    class MyProgressDialog(context: Context) : ProgressDialog(context,R.style.CustomProgressDialog){
        override fun onCreate(savedInstanceState: Bundle?) {
            window?.setBackgroundDrawableResource(android.R.color.transparent)
            super.onCreate(savedInstanceState)
            setContentView(R.layout.custom_progress_dialog)
        }
    }
}