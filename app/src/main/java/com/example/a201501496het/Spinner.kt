package com.example.a201501496het

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_spinner.*

class Spinner : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)


        val fruit = resources.getStringArray(R.array.fruit)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, fruit
        )
        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.adapter = adapter

        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }




        spinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?, position: Int, id: Long
                ) {
                    var planet = parent?.getItemAtPosition(position).toString()

                    when(position){
                        0 ->imageView.setImageResource(R.drawable.apple)
                        1->imageView.setImageResource(R.drawable.banana)
                        2->imageView.setImageResource(R.drawable.grape)
                        3->imageView.setImageResource(R.drawable.orange)
                        4->imageView.setImageResource(R.drawable.papaya)
                        5->imageView.setImageResource(R.drawable.pineapple)
                        6->imageView.setImageResource(R.drawable.strawberry)
                        7->imageView.setImageResource(R.drawable.watermelon)
                    }

                    Toast.makeText(
                        parent?.context,
                        "선택된 과일은 $planet",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
    }
}

