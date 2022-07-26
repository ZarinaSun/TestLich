package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    fun testGoHome(view: View) {
        val testGoHomeIntent = Intent(this, BasementActivity::class.java)
        startActivity(testGoHomeIntent)
    }
    fun testBackHome(view: View) {
        val testBackHomeIntent = Intent(this, PlateActivity::class.java)
        startActivity(testBackHomeIntent)
    }
}