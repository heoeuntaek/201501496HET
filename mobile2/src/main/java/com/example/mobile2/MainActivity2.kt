package com.example.mobile2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.KEYCODE_ENTER
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




        var etInput = findViewById<EditText>(R.id.etInput)

        etInput.setOnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KEYCODE_ENTER) {
                var word = etInput.text.toString()
                when (word) {
                    "inadvertent" -> tvWord.text = "부주의한, 소홀한"
                    "debilitate" -> tvWord.text ="쇠약하게 하다"
                    "obviate" -> tvWord.text ="(위험이나 곤란을)제거하다"
                }

            }

            true
        }


    }
}