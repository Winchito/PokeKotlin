package com.example.pookot.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity


class waterPokemon(n: String= "Pok", aP: Float = 30f, lP: Float = 100f): Pokemon(n, lP, aP){

    private var maxResistence = 500
    private var submergedTime = 0


    fun waterPokemon(n: String, aP: Float, mR: Int){
        this.name = n
        this.attackPoints = aP
        this.maxResistence = mR
        this.sayHi()
    }

    fun breathe() { this.submergedTime = 0 }
    fun immerse() { this.submergedTime++ }

    override fun attack(){
        Toast.makeText(MainActivity.maincontext, "$name Ataca con chorro!!!", Toast.LENGTH_LONG).show()}

}