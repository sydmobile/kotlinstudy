package com.syd.studykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(args : Array<String>){
    println("hello kotlin !")
    var a = 33
    a = "2222"
}


internal class Person(var name: String?)
