package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerHouseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_house)
    }
    fun testAnswerHouse(view: View) {
        val testAnswerHouseIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerHouseIntent)
    }
}