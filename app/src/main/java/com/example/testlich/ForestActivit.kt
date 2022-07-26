package com.example.testlich

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ForestActivit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forest)
    }

    fun testGoKey(view: View) {
        val testGoKeyIntent = Intent(this, KeyActivity::class.java)
        startActivity(testGoKeyIntent)
    }
    fun testBackForest(view: View) {
        val testBackForestIntent = Intent(this, RulesActivity::class.java)
        startActivity(testBackForestIntent)
    }
}