package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_river)
    }
    fun testGoRiver (view: View) {
        val testGoRiverIntent = Intent (this,PlateActivity::class.java)
        startActivity(testGoRiverIntent)
    }
    fun testBackRiver (view: View) {
        val testBackRiverIntent = Intent (this,DwarfActivity::class.java)
        startActivity(testBackRiverIntent)
    }
}