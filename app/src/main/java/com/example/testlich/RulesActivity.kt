package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
    }
    fun testGo (view: View) {
        val testGoIntent = Intent (this,ForestActivit::class.java)
        startActivity(testGoIntent)
    }
    fun testBack (view: View) {
        val testBackIntent = Intent (this,MainActivity::class.java)
        startActivity(testBackIntent)
    }
}