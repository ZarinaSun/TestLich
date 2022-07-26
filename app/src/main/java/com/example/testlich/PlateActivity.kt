package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PlateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plate)
    }
    fun testGoPlate (view: View) {
        val testGoPlateIntent = Intent (this,HomeActivity::class.java)
        startActivity(testGoPlateIntent)
    }
    fun testBackPlate (view: View) {
        val testBackPlateIntent = Intent (this,RiverActivity::class.java)
        startActivity(testBackPlateIntent)
    }
}