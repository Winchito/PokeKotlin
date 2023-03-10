package com.example.pookot

open class Athlete(var name: String, var height: Float, var weight: Float, var age: Int ) {

    fun Athlete(Name: String, Height: Float, Weight: Float, Age: Int){
        this.name = Name
        this.height = Height
        this.weight = Weight
        this.age = Age
    }
    fun rest(){
        println("Que buen descancito, a comer buñuelos")
    }
}


open class Runner(n: String, h: Float, w: Float, a: Int, override var runnerType: String, override var runnerSpeed: Float): Athlete(n, h, w, a), RunnerAction{

  /*  fun Runner(n: String, h: Float, w: Float, a: Int, Style: String, Speed: Float){
        this.name = n
        this.height = h
        this.weight = w
        this.age = a
        this.runnerType = Style
        this.runnerSpeed = Speed
    }

   */
    fun compete() {println("Voy a correr!")}
}


class Cyclist(n: String, h: Float, w: Float, a: Int, override var bicycleType: String,
              override var cyclistSpeed: Float
): Athlete(n, h, w, a), CyclistAction {

/*open fun Cyclist(n: String, h: Float, w: Float, a: Int, bType: String, Speed: Float) {
        this.name = n
        this.height = h
        this.weight = w
        this.age = a
        this.bicycleType = bType
        this.cylistSpeed = Speed
    }

 */
    fun compete() {println("Voy a pedalear!!!")}

}
open class Swimmer(n: String, h: Float, w: Float, a: Int, override var swimmerStyle: String, override var swimmerSpeed: Float): Athlete(n, h, w, a), SwimmerAction{

/*
        fun Swimmer(n: String, h: Float, w: Float, a: Int, Style: String, Speed: Float){
            this.name = n
            this.height = h
            this.weight = w
            this.age = a
            this.swimmerStyle = Style
            this.swimmerSpeed = Speed
        }

*/
        fun compete() {println("Voy a nadar!")}

    }

class triAthlete(n: String, h: Float, w: Float, a: Int, override var swimmerStyle: String, override var swimmerSpeed: Float,
                 override var runnerType: String, override var runnerSpeed: Float,
                 override var bicycleType: String, override var cyclistSpeed: Float): Athlete(n,h,w,a), SwimmerAction, RunnerAction, CyclistAction{

    /*            fun triAthlete(n: String, h: Float, w: Float, a: Int, swimmerStyle: String,
                    swimmerSpeed: Float, runnerType: String,  runnerSpeed: Float,
                    cylistSpeed: Float, bicycleType: String){
                         this.name = n
                         this.height = h
                         this.weight = w
                         this.age = a
                         this.swimmerSpeed = swimmerSpeed
                         this.swimmerStyle = swimmerStyle
                         this.runnerSpeed = runnerSpeed
                         this.runnerType = runnerType
                         this.bicycleType = bicycleType
                         this.cylistSpeed = cylistSpeed
                     }

     */
}

interface RunnerAction{
    var runnerType: String
    var runnerSpeed: Float
    fun run(){ println("Estoy corriendo con el estilo ${this.runnerType} a ${this.runnerSpeed}!!")}
}
interface CyclistAction{
    var bicycleType: String
    var cyclistSpeed: Float
    fun rideBike() {println("Estoy usando la bicicleta ${this.bicycleType} y yendo a ${this.cyclistSpeed} km/h!!")}
}
interface SwimmerAction{
    var swimmerStyle: String
    var swimmerSpeed: Float
    fun swim(){println("Estoy nadando con el estilo ${this.swimmerStyle} a ${this.swimmerSpeed}!!")}


}