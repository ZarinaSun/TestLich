package com.example.testlich

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ListOfAnswersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_answers)
    }
    fun testAnsFor(view: View) {
        val testAnsForIntent = Intent(this, AnswerForestActivity::class.java)
        startActivity(testAnsForIntent)
    }
    fun testAnsKey(view: View) {
        val testAnsKeyIntent = Intent(this, AnswerKeyActivity::class.java)
        startActivity(testAnsKeyIntent)
    }
    fun testAnsBea(view: View) {
        val testAnsBeaIntent = Intent(this, AnswerBearActivity::class.java)
        startActivity(testAnsBeaIntent)
    }
    fun testAnsSpr(view: View) {
        val testAnsSprIntent = Intent(this, AnswerSpringActivity::class.java)
        startActivity(testAnsSprIntent)
    }
    fun testAnsDw(view: View) {
        val testAnsDwIntent = Intent(this, AnswerDwarfActivity::class.java)
        startActivity(testAnsDwIntent)
    }
    fun testAnsRiv(view: View) {
        val testAnsRivIntent = Intent(this, AnswerRiverActivity::class.java)
        startActivity(testAnsRivIntent)
    }
    fun testAnsPl(view: View) {
        val testAnsPlIntent = Intent(this, AnswerPlateActivity::class.java)
        startActivity(testAnsPlIntent)
    }
    fun testAnsH(view: View) {
        val testAnsHIntent = Intent(this, AnswerHouseActivity::class.java)
        startActivity(testAnsHIntent)
    }
    fun testAnsBas(view: View) {
        val testAnsBasIntent = Intent(this, AnswerBasementActivity::class.java)
        startActivity(testAnsBasIntent)
    }
    fun testAnsAt(view: View) {
        val testAnsAtIntent = Intent(this, AnswerAtticActivity::class.java)
        startActivity(testAnsAtIntent)
    }
    fun testAnsLeavHous(view: View) {
        val testAnsLeavHousIntent = Intent(this, AnswerLeavingTheHouseActivity::class.java)
        startActivity(testAnsLeavHousIntent)
    }
    fun testAnsSea(view: View) {
        val testAnsSeaIntent = Intent(this, AnswerSeagullsActivity::class.java)
        startActivity(testAnsSeaIntent)
    }
    fun testAnsSh(view: View) {
        val testAnsShIntent = Intent(this, AnswerShipActivity::class.java)
        startActivity(testAnsShIntent)
    }

}