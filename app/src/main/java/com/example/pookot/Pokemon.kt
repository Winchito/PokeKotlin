package com.example.pookot

import android.widget.Toast
import com.example.pookot.MainActivity.Companion.maincontext

open class Pokemon(protected var name: String = "Pok",
                   protected var lifePoints: Float = 100f,
                   protected var attackPoints: Float = 50f): thanks(){



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

    class waterPokemon(n: String= "Pok", aP: Float = 30f, lP: Float = 100f): Pokemon(n, aP, lP){

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

        override fun attack(){Toast.makeText(maincontext, "$name Ataca con chorro!!!", Toast.LENGTH_LONG).show()}

    }

class firePokemon(n: String= "Pok", aP: Float = 30f, lP: Float = 100f): Pokemon(n, aP, lP){

    private var ballTemperature = 50
    lateinit var ball: fireBall
    var numBall: Int = 0


    fun firePokemon(n: String, aP: Float, bT: Int){
        this.name = n
        this.attackPoints = aP
        this.lifePoints = 100f
        this.ballTemperature = bT
        this.sayHi()
    }

    override fun attack(){

        super.attack()
        Toast.makeText(maincontext, "Ataque con fuego!", Toast.LENGTH_LONG).show()

        Toast.makeText(maincontext, "Bola ${++numBall}", Toast.LENGTH_LONG).show()
        ball = fireBall(ballTemperature)
        ball.throwBall()
    }
    }

class fireBall(var temp: Int =100){
    fun throwBall(){
        Toast.makeText(maincontext, "Tirando bola con temperatura de $temp", Toast.LENGTH_LONG).show()
    }
}

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
        Toast.makeText(maincontext, "Cabaré un tunnel de ${this.depth}m de profundidad",
            Toast.LENGTH_LONG).show()
    }

    override fun attack(){ Toast.makeText(maincontext, "Ataque con piedras", Toast.LENGTH_SHORT).show() }
}

abstract class thanks(){
    fun thanksCure(){ Toast.makeText(maincontext, "Gracias por curarme!", Toast.LENGTH_SHORT).show() }
}

interface sayBay{
    var dato: Int
    fun sayBye() { Toast.makeText(maincontext, "ByeBye!", Toast.LENGTH_SHORT).show()  }
}
interface sayBay2{
    fun sayBye2() { Toast.makeText(maincontext, "ByeBye!", Toast.LENGTH_SHORT).show()  }
}
interface sayBay3{
    fun sayBye3() { Toast.makeText(maincontext, "ByeBye!", Toast.LENGTH_SHORT).show()  }
}



