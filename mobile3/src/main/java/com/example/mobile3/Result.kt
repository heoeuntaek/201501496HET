package com.example.mobile3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var selectA = intent.getBooleanExtra("dataA", true)
        var selectB = intent.getBooleanExtra("dataB", true)
        var selectC = intent.getBooleanExtra("dataC", true)



        if (selectA) {
            numberTextView.text = "Ball"
        } else {

            numberTextView.text = "Ball"
            numberTextView.setBackgroundColor(R.color.red)
        }

        if (selectB) {
            numberTextView.text = "Ball"
        } else {

            numberTextView.text = "Ball"
            numberTextView.setBackgroundColor(R.color.red)
        }

        if (selectC) {
            numberTextView.text = "Ball"
        } else {

            numberTextView.text = "Ball"
            numberTextView.setBackgroundColor(R.color.red)
        }


    }
}