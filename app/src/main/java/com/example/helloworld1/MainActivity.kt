package com.example.helloworld1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "${sumNumber(7 , 8)} ")
    }
    fun sumNumber( number1:Int , number2:Int){

        var sum = number1 + number2
        if(number1 == 8 && number2 == 8){
       println("Number1 and Number2 the same and the sum is $sum . ")}
        else{
            println(sum)
        }

    }
}