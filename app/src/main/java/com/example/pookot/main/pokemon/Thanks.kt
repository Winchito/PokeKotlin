package com.example.pookot.main.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity


abstract class thanks(){
    fun thanksCure(){ Toast.makeText(MainActivity.maincontext, "Gracias por curarme!", Toast.LENGTH_SHORT).show() }
}

