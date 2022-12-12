package com.example.mobile2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.example.mobile2.Word

class WordViewModel2 : ViewModel() {

    var curIndex = 0

    private val wordBank = listOf<Word>(
        Word("inadvertent", "부주의한, 소홀한"),
        Word("debilitate", "쇠약하게 하다"),
        Word("obviate", "(위험이나 곤란을)제거하다")

    )

//    val curAnswer: String
//        get() = wordBank[curIndex].answer
//    val curQuestion: String
//        get() = wordBank[curIndex].question
//    val curNumber1: String
//        get() = wordBank[curIndex].number_1
//    val curNumber2: String
//        get() = wordBank[curIndex].number_2
//    val curNumber3: String
//        get() = wordBank[curIndex].number_3
//    val curNumber4: String
//        get() = wordBank[curIndex].number_4
//
//
//    fun moveToNext() {
//        curIndex = (curIndex + 1) % wordBank.size
//    }
//
//    fun moveToPrevious() {
//        if (curIndex == 0) {
//            curIndex = wordBank.size - 1
//        } else {
//            curIndex -= 1
//        }
//    }
}
