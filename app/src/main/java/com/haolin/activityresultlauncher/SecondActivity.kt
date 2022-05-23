package com.haolin.activityresultlauncher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("lyb======", intent.getStringExtra("name") ?: "name空")
        Log.e("lyb======", intent.getStringExtra("ege") ?: "ege空")
        val btnJump = findViewById<Button>(R.id.btnJump)
        btnJump.setOnClickListener {
            val intent = Intent().apply {
                putExtra("name", "张三")
            }
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}