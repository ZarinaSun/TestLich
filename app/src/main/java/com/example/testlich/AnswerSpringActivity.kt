package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerSpringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_spring)
    }
    fun testAnswerSpring(view: View) {
        val testAnswerSpringIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerSpringIntent)
    }
}