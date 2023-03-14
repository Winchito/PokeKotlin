package com.example.pookot.main.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity

class firePokemon(n: String = "Pok", aP: Float = 30f, lP: Float = 100f) :
    Pokemon(n, aP, lP), fireBall {
    override var temp: Int = 50
    lateinit var ball: fireBall
    var numBall: Int = 0


    fun firePokemon(n: String, aP: Float, bT: Int) {
        this.name = n
        this.attackPoints = aP
        this.lifePoints = 100f
        this.temp = bT
        this.sayHi()
    }

    override fun attack() {

        // super.attack()
        Toast.makeText(MainActivity.maincontext, "Ataque con fuego!", Toast.LENGTH_LONG).show()
        Toast.makeText(MainActivity.maincontext, "Bola ${++numBall}", Toast.LENGTH_LONG).show()
        ball.throwBall()
    }
}
