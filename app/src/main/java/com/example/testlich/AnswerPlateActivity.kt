package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerPlateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_plate)
    }
    fun testAnswerPlate(view: View) {
        val testAnswerPlateIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerPlateIntent)
    }
}