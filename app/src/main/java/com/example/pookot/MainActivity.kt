package com.example.pookot

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.pookot.pokemon.*


class MainActivity : AppCompatActivity(), PokemonCreationView {
    private val pokemonNames = arrayOf("Gengar", "Mewtwo", "Jigglypuff")

    companion object {
        lateinit var maincontext: Context
    }

    //Companion valores estaticos, el maincontext proporciona el appContext general de la aplicación

    //lateinit asigna el valor de una propiedad para despues
    private lateinit var pok: Pokemon
    private lateinit var waterPok: waterPokemon
    private lateinit var firePok: firePokemon
    private lateinit var earthPok: earthPokemon

    /*
    //Objetos anonimos
    object Pepe {
        var apodo = "pepito"
        fun saludo() {
            println("Hola, me llaman $apodo")
        }
    }
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        maincontext = this

        val viewer = PokemonViewer(this)
        viewer.createPokemons()

        val radioGroup = findViewById<RadioGroup>(R.id.rgPokemonNames)
        val radioButton = findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
        val etAttackPower = findViewById<EditText>(R.id.etAttackPower)
        val btPokemon = findViewById<Button>(R.id.btPokemon)





/*
        //Prueba ejercicios Atletas
        var athlete: Athlete = Athlete("Cesar Gonzalez", 1.80f, 69f, 23)
        var cyclist: Cyclist = Cyclist("Pedro Fonseca",1.70f,80f,25,"Todoterreno",25.6f)
        var swimmer: Swimmer = Swimmer("Nicolas Guiterrez", 1.75f, 70f, 20, "Braza", 5f)
        var runner: Runner = Runner("Claudio Sanchez", 1.68f, 66f, 26, "Trote", 15f)
        var triathlete: triAthlete = triAthlete("Victor Garcia", 1.65f, 62f, 25, "Mariposa",7f, "Carrera de vallas", 13f, "BMX", 20.2f)


        println("Hola!, mi nombre es ${athlete.name} tengo ${athlete.age}, mido ${athlete.height} cm y peso ${athlete.weight} kg!")
        athlete.rest()
        println("Hola!, mi nombre es ${cyclist.name}, soy un ciclista, tengo ${cyclist.age}, mido ${cyclist.height} cm y peso ${athlete.weight} kg!")
        cyclist.compete()
        cyclist.rideBike()
        println("Hola!, mi nombre es ${swimmer.name} soy un nadador, tengo ${swimmer.age}, mido ${swimmer.height} cm y peso ${swimmer.weight} kg!")
        swimmer.compete()
        swimmer.swim()
        println("Hola!, mi nombre es ${runner.name}, soy un corredor, tengo ${runner.age}, mido ${runner.height} cm y peso ${runner.weight}!")
        runner.compete()
        runner.run()
        println("Hola!, mi nombre es ${triathlete.name}, soy un triatleta! Tengo ${triathlete.age}, mido ${triathlete.height} cm y peso ${triathlete.weight}!")
        triathlete.swim()
        triathlete.run()
        triathlete.rideBike()

        */

/*
        //Introducción Programación Orientada a Objetos

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

        // Acceso a las Subclases de las clases

        var sc = SubClasses()
        println(sc.presentar())

        var ani = SubClasses.Anidada()
        println(ani.presentar())

        var inn = SubClasses().Interna()
        println(inn.presentar())

        // Clases Anonimas

        println(pepito.saludo())
        pepito.apodo = "SuperPepe"
        println(pepito.saludo())

        //Data class (Solo almacena datos, aunque se puede poner metodos, no es recomendado)

        var sol : star = star("Sol", 696340f, "Vía Láctea")
        println(sol)

        var betelgeuse : star = star("Betelgeuse", 617100000f, "Orión")
        betelgeuse.alive = false
        println(betelgeuse.alive)

        var nueva : star = star()
        println(nueva)

        //Enum class

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

        val btFight = findViewById<Button>(R.id.btFight)
        btFight.setOnClickListener {
            fight(firePok, earthPok)
        }



    }

    override fun createPokemonRadioButtons(pokemonNames: Array<String>) {
        val radioGroup = findViewById<RadioGroup>(R.id.rgPokemonNames)

        for (pokemonName in pokemonNames) {
            val radioButton = RadioButton(this)
            radioButton.text = pokemonName
            radioButton.id = View.generateViewId()
            radioGroup.addView(radioButton)
        }
    }

    fun createPokemon(v: View){

        pok = Pokemon()

        val radioGroup = findViewById<RadioGroup>(R.id.rgPokemonNames)
        val radioButton = findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
        val etAttackPower = findViewById<EditText>(R.id.etAttackPower)


        if(radioButton != null && !etAttackPower.text.isNullOrEmpty())
            pok.Pokemon(radioButton.text.toString(), etAttackPower.text.toString().toFloat())

        val tvPokemon = findViewById<TextView>(R.id.tvPokemon)
        loadDataPokemon(tvPokemon, pok)

        val ivPokemon = findViewById<ImageView>(R.id.imgPokemon)
        val resourceId = resources.getIdentifier(radioButton.text.toString().lowercase(), "mipmap", packageName)
        ivPokemon.setImageResource(resourceId)

    }
/*
    fun createPokemon(v: View) {

        pok = Pokemon()


        val etName = findViewById<EditText>(R.id.etName)
        val etAttackPower = findViewById<EditText>(R.id.etAttackPower)

        if (!etName.text.isNullOrEmpty() && !etAttackPower.text.isNullOrEmpty())
            pok.Pokemon(etName.text.toString(), etAttackPower.text.toString().toFloat())

        val tvPokemon = findViewById<TextView>(R.id.tvPokemon)
        loadDataPokemon(tvPokemon, pok)

        val ivPokemon = findViewById<ImageView>(R.id.imgPokemon)
        ivPokemon.setImageResource(R.mipmap.pokemon)

    }

 */

    fun createWaterPokemon(v: View) {

        waterPok = waterPokemon()

        val etWaterName = findViewById<EditText>(R.id.etWaterName)
        val etWaterAttackPower = findViewById<EditText>(R.id.etWaterAttackPower)
        val etWaterMaxResistence = findViewById<EditText>(R.id.etWaterMaxResistence)

        if (!etWaterName.text.isNullOrEmpty() && !etWaterAttackPower.text.isNullOrEmpty())
            waterPok.waterPokemon(etWaterName.text.toString(), etWaterAttackPower.text.toString().toFloat(), etWaterMaxResistence.text.toString().toInt())

        val imgWaterPokemon = findViewById<ImageView>(R.id.imgWaterPokemon)
        imgWaterPokemon.setImageResource(R.mipmap.water)
        imgWaterPokemon.setBackgroundColor(ContextCompat.getColor(this, R.color.white))

        val tvWaterPokemon = findViewById<TextView>(R.id.tvWaterPokemon)
        loadDataPokemon(tvWaterPokemon, waterPok)
    }
    fun cureWaterPokemon(v: View) {
        waterPok.cure()
        val tvWaterPokemon = findViewById<TextView>(R.id.tvWaterPokemon)
        loadDataPokemon(tvWaterPokemon, waterPok)
    }

    fun sayHiWaterPokemon(v: View) {
        waterPok.sayHi()
    }
    fun evolveWaterPokemon(v: View) {
        val etEvolveWaterPokemon = findViewById<EditText>(R.id.etEvolveWaterPokemon)

        waterPok.evolve(etEvolveWaterPokemon.text.toString())

        val imgWaterPokemon = findViewById<ImageView>(R.id.imgWaterPokemon)
        imgWaterPokemon.setImageResource(R.mipmap.water_evolved)

        val tvWaterPokemon = findViewById<TextView>(R.id.tvWaterPokemon)
        loadDataPokemon(tvWaterPokemon, waterPok)

    }
    fun createFirePokemon(v: View) {
        val etFireName = findViewById<EditText>(R.id.etFireName)
        val etFireAttackPower = findViewById<EditText>(R.id.etFireAttackPower)
        val etFireBallTemperature = findViewById<EditText>(R.id.etFireBallTemperature)

        firePok = firePokemon()

        if (!etFireName.text.isNullOrEmpty() && !etFireAttackPower.text.isNullOrEmpty())
            firePok.firePokemon(etFireName.text.toString(), etFireAttackPower.text.toString().toFloat(), etFireBallTemperature.text.toString().toInt())

        val ivFirePokemon = findViewById<ImageView>(R.id.imgFirePokemon)
        ivFirePokemon.setImageResource(R.mipmap.fire)
        ivFirePokemon.setBackgroundColor(ContextCompat.getColor(this,R.color.white))


        val tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)
    }

    fun cureFirePokemon(v: View) {
        firePok.cure()
        val tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)
    }

    fun sayHiFirePokemon(v: View) {
        firePok.sayHi()
    }

    fun evolveFirePokemon(v: View) {

        val etEvolveFirePokemon = findViewById<EditText>(R.id.etEvolveFirePokemon)

        firePok.evolve(etEvolveFirePokemon.text.toString())

        val ivFirePokemon = findViewById<ImageView>(R.id.imgFirePokemon)
        ivFirePokemon.setImageResource(R.mipmap.fire_evolved)

        val tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)
    }


    fun createEarthPokemon(v: View) {
        val etEarthName = findViewById<EditText>(R.id.etEarthName)
        val etEarthAttackPower = findViewById<EditText>(R.id.etEarthAttackPower)
        val etEarthMaxDepth = findViewById<EditText>(R.id.etEarthMaxDepth)

        earthPok = earthPokemon()

        if (!etEarthName.text.isNullOrEmpty() && !etEarthAttackPower.text.isNullOrEmpty())
            earthPok.earthPokemon(etEarthName.text.toString(), etEarthAttackPower.text.toString().toFloat(), etEarthMaxDepth.text.toString().toInt())

        val ivEarthPokemon = findViewById<ImageView>(R.id.imgEarthPokemon)
        ivEarthPokemon.setImageResource(R.mipmap.earth)
        ivEarthPokemon.setBackgroundColor(ContextCompat.getColor(this,R.color.white))


        val tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }

    fun cureEarthPokemon(v: View) {
        earthPok.cure()
        val tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }

    fun sayByeEarthPokemon(v: View) {
        earthPok.sayBye()
    }
    fun sayHiEarthPokemon(v: View) {
        earthPok.sayHi()
    }

    fun evolveEarthPokemon(v: View) {

        val etEvolveEarthPokemon = findViewById<EditText>(R.id.etEvolveEarthPokemon)

        earthPok.evolve(etEvolveEarthPokemon.text.toString())

        val ivEarthPokemon = findViewById<ImageView>(R.id.imgEarthPokemon)
         ivEarthPokemon.setImageResource(R.mipmap.earth_evolved)

        val tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }
    private fun fight(p1: Pokemon, p2: Pokemon) {

        val emtLog = findViewById<EditText>(R.id.emtLog)
        emtLog.setText("")
        var text = ""

        text += "\n${p1.getName()} (${p1.getLifePoints().toInt()}) Vs ${p2.getName()} (${p2.getLifePoints().toInt()})"

        while (p1.getLifePoints() > 0 && p2.getLifePoints() > 0) {
            text += "\n${p1.getName()} ataca!"
            p1.attack()
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

        val tvFirePokemon = findViewById<TextView>(R.id.tvFirePokemon)
        loadDataPokemon(tvFirePokemon, firePok)

        val tvEarthPokemon = findViewById<TextView>(R.id.tvEarthPokemon)
        loadDataPokemon(tvEarthPokemon, earthPok)
    }
    private fun loadDataPokemon(tv: TextView, p: Pokemon) {
        var description = ""

        description += p.getName() + "("
        description += "AP: " + p.getAttackPoints().toInt()
        description += "Life: " + p.getLifePoints() + ")"

        tv.text = description
    }
}

