package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerKeyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_key)
    }
    fun testAnswerKey(view: View) {
        val testAnswerKeyIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerKeyIntent)
    }
}