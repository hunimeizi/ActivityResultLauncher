package com.haolin.activityresultlauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.haolin.activityresultlauncher.launcher.StartActivityLauncher

class MainActivity : AppCompatActivity() {

    val launcher = StartActivityLauncher(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnJump = findViewById<Button>(R.id.btnJump)
        btnJump.setOnClickListener {
            //跳转到第二页 传参
            launcher.launch<SecondActivity>(
                "name" to "张三",
                "ege" to "12"
            ) { resultCode, data ->
                if(resultCode == RESULT_OK) {
                    data?.getStringExtra("name")?.let {
                        Log.e("lyb======", it)
                    }
                }
            }
        }
    }
}