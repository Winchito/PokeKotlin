package com.example.pookot.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity.Companion.maincontext

open class Pokemon(protected var name: String = "Pok",
                   protected var lifePoints: Float = 100f,
                   protected var attackPoints: Float = 50f): thanks() {
    fun Pokemon(n: String, aP: Float){
        this.name = n
        this.attackPoints = aP
        this.lifePoints = 100f
    }
    internal fun getName(): String{ return this.name}
    internal fun getAttackPoints(): Float { return this.attackPoints}
    internal fun setLifePoints(life: Float){ this.lifePoints = life}
    internal fun getLifePoints(): Float{ return this.lifePoints}

    fun sayHi(){Toast.makeText(maincontext, "Hola!!, soy $name", Toast.LENGTH_LONG).show()}

    fun cure(){
        this.lifePoints = 100f
        this.thanksCure()
    }
    fun evolve(n: String){
        this.name = n
        this.lifePoints += 100f
        this.attackPoints *= 1.20f
        this.sayHi()
    }
    open fun attack(){Toast.makeText(maincontext, "$name Ataca!!!", Toast.LENGTH_LONG).show()}
}





