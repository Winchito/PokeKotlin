package com.example.pookot.main.pokemon

class PokemonViewer(private val interfaz: PokemonCreationView) {
        fun createPokemons() {
            val pokemonNames = arrayOf("Gengar", "Mewtwo", "Jigglypuff", "Rattata")
            interfaz.createPokemonRadioButtons(pokemonNames)
        }
    }
