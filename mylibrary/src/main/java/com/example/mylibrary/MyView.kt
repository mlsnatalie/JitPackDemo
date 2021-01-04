package com.example.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast

/**
 * @author: mlsnatalie
 * @date: 2021/1/4 2:34 PM
 * @UpdateDate: 2021/1/4 2:34 PM
 * email：mlsnatalie@163.com
 * description：
 */
class MyView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_myview, this, true)

        val tv = findViewById<TextView>(R.id.tv_jitPack)
        tv.setOnClickListener { showDiagnose() }
    }

    public fun showDiagnose() {
        Toast.makeText(context, "自定义android库", Toast.LENGTH_LONG).show()
        Log.e("aaaddd", "自定义android库")
    }
}