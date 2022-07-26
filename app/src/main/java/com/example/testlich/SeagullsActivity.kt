package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SeagullsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seagulls)
    }
    fun testGoSeagulls(view: View) {
        val testGoSeagullsIntent = Intent(this, ShipActivity::class.java)
        startActivity(testGoSeagullsIntent)
    }
    fun testBackSeagulls(view: View) {
        val testBackSeagullsIntent = Intent(this, LeaveActivity::class.java)
        startActivity(testBackSeagullsIntent)
    }
}