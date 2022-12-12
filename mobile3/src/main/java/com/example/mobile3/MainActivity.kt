package com.example.mobile3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // true - ball
// falst - strike

        var selectA: Boolean = true
        var selectB: Boolean = true
        var selectC: Boolean = true

        radioGroupA.setOnCheckedChangeListener { _, checkedId ->
            var sb = StringBuilder()
            var rdButton: RadioButton = findViewById(checkedId)
            when (checkedId) {
                R.id.radioButtonAb -> {
                    selectA = true
                }
                R.id.radioButtonAs -> {
                    selectA = false
                }
            }
        }

        radioGroupB.setOnCheckedChangeListener { _, checkedId ->
            var sb = StringBuilder()
            var rdButton: RadioButton = findViewById(checkedId)
            when (checkedId) {
                R.id.radioButtonBb -> {
                    selectB = true
                }
                R.id.radioButtonBs -> {
                    selectB = false
                }
            }
        }

        radioGroupC.setOnCheckedChangeListener { _, checkedId ->
            var sb = StringBuilder()
            var rdButton: RadioButton = findViewById(checkedId)
            when (checkedId) {
                R.id.radioButtonCb -> {
                    selectC = true
                }
                R.id.radioButtonCs -> {
                    selectC = false
                }
            }
        }

        checkButton.setOnClickListener {
            var intent = Intent(this, Result::class.java)
            intent.putExtra("dataA", selectA)
            intent.putExtra("dataB", selectA)
            intent.putExtra("dataB", selectA)
            startActivity(intent)
        }


    }
}