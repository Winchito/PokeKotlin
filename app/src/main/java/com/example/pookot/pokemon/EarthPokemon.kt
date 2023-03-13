package com.example.pookot.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity


class earthPokemon(n:String = "Pok", aP: Float = 30f, lP: Float = 100f)
    : Pokemon(n, aP, lP), sayBay, sayBay2, sayBay3 {
    private var depth: Int = 150
    override var dato: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    fun earthPokemon(n: String, aP: Float, d: Int) {
        this.name = n
        this.attackPoints = aP
        this.lifePoints = 100f
        this.depth = d
        this.sayHi()
    }

    fun digTunnel(){
        Toast.makeText(
            MainActivity.maincontext, "Cabaré un tunnel de ${this.depth}m de profundidad",
            Toast.LENGTH_LONG).show()
    }

    override fun attack(){ Toast.makeText(MainActivity.maincontext, "Ataque con piedras", Toast.LENGTH_SHORT).show() }
}

