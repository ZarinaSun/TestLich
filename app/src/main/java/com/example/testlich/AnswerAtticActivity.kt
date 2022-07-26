package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerAtticActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_attic)
    }
    fun testAnswerAttic(view: View) {
        val testAnswerAtticIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerAtticIntent)
    }
}