package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerForestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_forest)
    }
    fun testAnswerForest(view: View) {
        val testAnswerForestIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerForestIntent)
    }
}