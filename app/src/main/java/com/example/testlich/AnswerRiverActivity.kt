package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerRiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_river)
    }
    fun testAnswerRiver(view: View) {
        val testAnswerRiverIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerRiverIntent)
    }
}