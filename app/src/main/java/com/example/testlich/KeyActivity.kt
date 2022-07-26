package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class KeyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key)
    }
    fun testGoKeyHome (view: View) {
        val testGoKeyHomeIntent = Intent (this,BearActivity::class.java)
        startActivity(testGoKeyHomeIntent)
    }
    fun testBackKeyHome (view: View) {
        val testBackKeyHomeIntent = Intent (this,ForestActivit::class.java)
        startActivity(testBackKeyHomeIntent)
    }
}