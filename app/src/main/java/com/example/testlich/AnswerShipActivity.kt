package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerShipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_ship)
    }
    fun testAnswerShip(view: View) {
        val testAnswerShipIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerShipIntent)
    }
}