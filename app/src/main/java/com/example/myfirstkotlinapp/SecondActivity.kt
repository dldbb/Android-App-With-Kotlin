package com.example.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber() {
        //Get the count from the extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        //Generate the random number
        val random = Random()
        var randomInt = 0
        //Add one because the bound is exclusive
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        //Display
        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_heading, count)
    }
}
