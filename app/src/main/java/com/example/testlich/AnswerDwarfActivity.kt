package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AnswerDwarfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_dwarf)
    }
    fun testAnswerDwarf(view: View) {
        val testAnswerDwarfIntent = Intent(this, ListOfAnswersActivity::class.java)
        startActivity(testAnswerDwarfIntent)
    }
}