package me.yifeiyuan.hf.ui

import android.app.Application
import me.yifeiyuan.adh.DebugConfig
import me.yifeiyuan.adh.DebugHelper

/**
 * Created by 程序亦非猿 on 2021/3/4.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        DebugConfig().apply {
            application = this@App
            debuggable = true
        }.also {
            DebugHelper.setup(it)
        }
    }
}