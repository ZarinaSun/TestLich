package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leave)
    }
    fun testGoLeave(view: View) {
        val testGoLeaveIntent = Intent(this, SeagullsActivity::class.java)
        startActivity(testGoLeaveIntent)
    }
    fun testBackLeave(view: View) {
        val testBackLeaveIntent = Intent(this, BasementActivity::class.java)
        startActivity(testBackLeaveIntent)
    }
}