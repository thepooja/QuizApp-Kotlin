package com.quizappkotlin

data class Questions(
    val id:Int,
    val question: String,
    val image:Int,
    val optionsOne:String,
    val optionsTwo:String,
    val optionsThree:String,
    val optionsFour:String,
    val correctAnswer:Int
)
