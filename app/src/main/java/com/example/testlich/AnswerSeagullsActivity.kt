package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerSeagullsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_seagulls)
    }
    fun testAnswerSeagulls(view: View) {
        val testAnswerSeagullsIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerSeagullsIntent)
    }
}