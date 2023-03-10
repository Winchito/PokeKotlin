package com.example.pookot

import android.widget.Toast


abstract class thanks(){
    fun thanksCure(){ Toast.makeText(MainActivity.maincontext, "Gracias por curarme!", Toast.LENGTH_SHORT).show() }
}

