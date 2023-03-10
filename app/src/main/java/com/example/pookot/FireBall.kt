package com.example.pookot

import android.widget.Toast

interface fireBall{

    var temp: Int

    fun throwBall(){
        Toast.makeText(MainActivity.maincontext, "Tirando bola con temperatura de $temp", Toast.LENGTH_LONG).show()
    }
}