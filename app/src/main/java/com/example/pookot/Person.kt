package com.example.pookot

open class Person(var name: String = "Anonimo", var passport: String? = null) {

    var alive: Boolean = true

    fun Person() {
        name = "Juan"
        passport = "1U482URU"
    }

    fun die() {
        alive = false
    }
}

class Athete(name: String, passport: String?, var sport: String): Person(){

}