package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerLeavingTheHouseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_leaving_the_house)
    }
    fun testAnswerLeavingTheHouse(view: View) {
        val testAnswerLeavingTheHouseIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerLeavingTheHouseIntent)
    }
}