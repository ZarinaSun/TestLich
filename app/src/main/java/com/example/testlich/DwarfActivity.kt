package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DwarfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dwarf)
    }
    fun testGoDwarf (view: View) {
        val testGoDwarfIntent = Intent (this,RiverActivity::class.java)
        startActivity(testGoDwarfIntent)
    }
    fun testBackDwarf (view: View) {
        val testBackDwarfIntent = Intent (this,SpringActivity::class.java)
        startActivity(testBackDwarfIntent)
    }
}