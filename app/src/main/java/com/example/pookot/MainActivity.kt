package com.example.pookot

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var maincontext: Context
    }

    private lateinit var pok: Pokemon
    private lateinit var waterPok: waterPokemon
    private lateinit var firePok: firePokemon
    private lateinit var earthPok: earthPokemon


    object pepe {
        var apodo = "pepito"
        fun saludo() {
            println("Hola, me llaman $apodo")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        maincontext = this

/*
        var pepito: Person = Person("Pepito", "RFJF4IK")
        println(pepito.alive)
        println(pepito.name)
        println(pepito.passport)

        pepito.die()
        println(pepito.alive)

        var anonimo: Person = Person()
        anonimo.Person()
        println(anonimo.alive)
        println(anonimo.name)
        println(anonimo.passport)

        var pele: Athete = Athete("Pele", "24234234", "Football")
        println(pele.alive)
        println(pele.name)
        println(pele.passport)
        println(pele.sport)


        var charizard: Pokemon = Pokemon()
        charizard.setLifePoints(45f)
        charizard.getLifePoints()
        charizard.getName()
        charizard.getAttackPoints()

*/

/*
        var sc = SubClasses()
        println(sc.presentar())

        var ani = SubClasses.Anidada()
        println(ani.presentar())

        var inn = SubClasses().Interna()
        println(inn.presentar())

        println(pepito.saludo())
        fernanda.apodo = "SuperPepe"
        println(pepito.saludo())

        var sol : star = star("Sol", 696340f, "Vía Láctea")
        println(sol)

        var betelgeuse : star = star("Betelgeuse", 617100000f, "Orión")
        betelgeuse.alive = false
        println(betelgeuse.alive)

        var nueva : star = star()
        println(nueva)

        var hoy: dias = dias.LUNES
        var semana = dias.values()
        for (i in semana) println(i)

        println(dias.valueOf("MIERCOLES"))
        println(hoy.name)
        println(hoy.ordinal)

        println(hoy.saludo())
        println(hoy.laboral)
        println(hoy.jornada)

        hoy = dias.DOMINGO


*/

        var btFight = findViewById<Button>(R.id.btFight)
        btFight.setOnClickListener {
            fight(firePok, earthPok)
        }

    }


    fun createPokemon(v: View) {

        var etName = findViewById<EditText>(R.id.etName)
        var etAttackPower = findViewById<EditText>(R.id.etAttackPower)

        pok = Pokemon()

        if (!etName.text.isNullOrEmpty() && !etAttackPower.text.isNullOrEmpty())
            pok.Pokemon(
                etName.text.toString(),
                etAttackPower.text.toString().toFloat()
            )

        var tvPokemon = findViewById<TextView>(R.id.tvPokemon)
        loadDataPokemon(tvPokemon, pok)

        var ivPokemon = findViewById<ImageView>(R.id.imgPokemon)
        ivPokemon.setImageResource(R.mipmap.pokemon)

    }

    fun createWaterPokemon(v: View) {
        var etWaterName = findViewById<EditText>(R.id.etWaterName)
        var etWaterAttackPower = findViewById<EditText>(R.id.etWaterAttackPower)
        var etWaterMaxResistence = findViewById<EditText>(R.id.etWaterMaxResistence)

        waterPok = waterPokemon()

        if (!etWaterName.text.isNullOrEmpty() && !etWaterAttackPower.text.isNullOrEmpty())
            waterPok.waterPokemon(
                etWaterName.text.toString(),
                etWaterAttackPower.text.toString().toFloat(),
                etWaterMaxResistence.text.toString().toInt()
            )

        var imgWaterPokemon = findViewById<ImageView>(R.id.imgWaterPokemon)
        imgWaterPokemon.setImageResource(R.mipmap.water)
        imgWaterPokemon.setBackgroundColor(ContextCompat.getColor(this, R.color.white))


        var tvWaterPokemon = findViewById<TextView>(R.id.tvWaterPokemon)
        loadDataPokemon(tvWaterPokemon, waterPok)
    }

    fun cureWaterPokemon(v: View) {
        waterPok.cure()
        var tvWaterPokemon = findViewById<TextView>(R.id.tvWaterPokemon)
        loadDataPokemon(tvWaterPokemon, waterPok)
    }

    fun sayHiWaterPokemon(v: View) {
        waterPok.sayHi()
    }

    fun evolveWaterPokemon(v: View) {
        var etEvolveWaterPokemon = findViewById<EditText>(R.id.etEvolveWaterPokemon)

        waterPok.evolve(etEvolveWaterPokemon.text.toString())

        var imgWaterPokemon = findViewById<ImageView>(R.id.imgWaterPokemon)
        imgWaterPokemon.setImageResource(R.mipmap.water_evolved)

        var tvWaterPokemon = findViewById<TextView>(R.id.tvWaterPokemon)
        loadDataPokemon(tvWaterPokemon, waterPok)

    }


    fun createFirePokemon(v: View) {
        var etFireName = findViewById<EditText>(R.id.etFireName)
        var etFireAttackPower = findViewById<EditText>(R.id.etFireAttackPower)
        var etFireBallTemperature = findViewById<EditText>(R.id.etFireBallTemperature)

        firePok = firePokemon()

        if (!etFireName.text.isNullOrEmpty() && !etFireAttackPower.text.isNullOrEmpty())
            firePok.firePokemon(
                etFireName.text.toString(),
                etFireAttackPower.text.toString().toFloat(),
                etFireBallTemperature.text.toString().toInt()
            )

        var ivFirePokemon = findViewById<ImageView>(R.id.imgFirePokemon)
        ivFirePokemon.setImageResource(R.mipmap.fire)
        ivFirePokemon.setBackgroundColor(ContextCompat.getColor(this,R.color.white))


        var tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)
    }

    fun cureFirePokemon(v: View) {
        firePok.cure()
        var tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)
    }

    fun sayHiFirePokemon(v: View) {
        firePok.sayHi()
    }

    fun evolveFirePokemon(v: View) {

        var etEvolveFirePokemon = findViewById<EditText>(R.id.etEvolveFirePokemon)

        firePok.evolve(etEvolveFirePokemon.text.toString())

        var ivFirePokemon = findViewById<ImageView>(R.id.imgFirePokemon)
        ivFirePokemon.setImageResource(R.mipmap.fire_evolved)

        var tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)
    }


    fun createEarthPokemon(v: View) {
        var etEarthName = findViewById<EditText>(R.id.etEarthName)
        var etEarthAttackPower = findViewById<EditText>(R.id.etEarthAttackPower)
        var etEarthMaxDepth = findViewById<EditText>(R.id.etEarthMaxDepth)

        earthPok = earthPokemon()

        if (!etEarthName.text.isNullOrEmpty() && !etEarthAttackPower.text.isNullOrEmpty())
            earthPok.earthPokemon(
                etEarthName.text.toString(),
                etEarthAttackPower.text.toString().toFloat(),
                etEarthMaxDepth.text.toString().toInt()
            )

        var ivEarthPokemon = findViewById<ImageView>(R.id.imgEarthPokemon)
        ivEarthPokemon.setImageResource(R.mipmap.earth)
        ivEarthPokemon.setBackgroundColor(ContextCompat.getColor(this,R.color.white))


        var tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }

    fun cureEarthPokemon(v: View) {
        earthPok.cure()
        var tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }

    fun sayHiEarthPokemon(v: View) {
        earthPok.sayHi()
    }

    fun evolveEarthPokemon(v: View) {

        var etEvolveEarthPokemon = findViewById<EditText>(R.id.etEvolveEarthPokemon)

        earthPok.evolve(etEvolveEarthPokemon.text.toString())

        var ivEarthPokemon = findViewById<ImageView>(R.id.imgEarthPokemon)
         ivEarthPokemon.setImageResource(R.mipmap.earth_evolved)

        var tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }
    private fun fight(p1: Pokemon, p2: Pokemon) {

        var emtLog = findViewById<EditText>(R.id.emtLog)
        emtLog.setText("")
        var text = ""

        text += "\n${p1.getName()} (${p1.getLifePoints().toInt()}) Vs ${p2.getName()} (${p2.getLifePoints().toInt()})"

        while (p1.getLifePoints() > 0 && p2.getLifePoints() > 0) {
            text += "\n${p1.getName()} ataca!"
            p1.attack();
            p2.setLifePoints(p2.getLifePoints() - p1.getAttackPoints())
            text += "\n${p1.getName()} (${p1.getLifePoints().toInt()}) Vs ${p2.getName()} (${p2.getLifePoints().toInt()})"
            if (p2.getLifePoints() > 0) {
                text += "\n${p2.getName()} ataca!"
                p2.attack()
                p1.setLifePoints(p1.getLifePoints() - p2.getAttackPoints())
                text += "\n${p1.getName()} (${p1.getLifePoints().toInt()}) Vs ${p2.getName()} (${p2.getLifePoints().toInt()})"
            }
        }
        if (p1.getLifePoints() > 0) text += "\n\nEL CAMPEON ES ${p1.getName()}"
        else text += "\n\nEL CAMPEON ES ${p2.getName()}"

        emtLog.setText(text)

        var tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)

        var tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }
    private fun loadDataPokemon(tv: TextView, p: Pokemon) {
        var description: String = ""

        description += p.getName() + "("
        description += "AP: " + p.getAttackPoints().toInt()
        description += "Life: " + p.getLifePoints() + ")"

        tv.text = description
    }
}

