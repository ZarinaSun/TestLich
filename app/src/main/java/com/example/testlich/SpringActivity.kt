package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SpringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spring)
    }
    fun testGoSpring (view: View) {
        val testGoSpringIntent = Intent (this,DwarfActivity::class.java)
        startActivity(testGoSpringIntent)
    }
    fun testBackSpring (view: View) {
        val testBackSpringIntent = Intent (this,BearActivity::class.java)
        startActivity(testBackSpringIntent)
    }
}
