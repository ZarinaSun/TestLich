package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerBearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_bear)
    }
    fun testAnswerBear(view: View) {
        val testAnswerBearIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerBearIntent)
    }
}