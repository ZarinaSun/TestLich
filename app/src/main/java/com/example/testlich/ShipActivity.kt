package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ShipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ship)
    }
    fun testGoShip(view: View) {
        val testGoShipIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testGoShipIntent)
    }
    fun testBackShip(view: View) {
        val testBackShipIntent = Intent(this, SeagullsActivity::class.java)
        startActivity(testBackShipIntent)
    }
}