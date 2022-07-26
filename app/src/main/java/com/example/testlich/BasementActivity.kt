package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BasementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basement)
    }
    fun testGoBasement(view: View) {
        val testGoBasementIntent = Intent(this, LeaveActivity::class.java)
        startActivity(testGoBasementIntent)
    }
    fun testBackBasement(view: View) {
        val testBackBasementIntent = Intent(this, HomeActivity::class.java)
        startActivity(testBackBasementIntent)
    }
}