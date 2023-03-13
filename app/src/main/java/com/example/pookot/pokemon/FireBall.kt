package com.example.pookot.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity

interface fireBall{

    var temp: Int

    fun throwBall(){
        Toast.makeText(MainActivity.maincontext, "Tirando bola con temperatura de $temp", Toast.LENGTH_LONG).show()
    }
}