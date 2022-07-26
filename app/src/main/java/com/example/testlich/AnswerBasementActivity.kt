package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerBasementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_basement)
    }
    fun testAnswerBasement(view: View) {
        val testAnswerBasementIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerBasementIntent)
    }
}