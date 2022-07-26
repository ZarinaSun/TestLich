package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bear)
    }
    fun testGoBear(view: View) {
        val testGoBearIntent = Intent (this,SpringActivity::class.java)
        startActivity(testGoBearIntent)
    }
    fun testBackBear(view: View) {
        val testBackBearIntent = Intent (this,KeyActivity::class.java)
        startActivity(testBackBearIntent)
    }
}