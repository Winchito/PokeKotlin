package com.example.pookot.pokemon

class PokemonViewer(private val interfaz: PokemonCreationView) {
        fun createPokemons() {
            val pokemonNames = arrayOf("Gengar", "Mewtwo", "Jigglypuff", "Rattata")
            interfaz.createPokemonRadioButtons(pokemonNames)
        }
    }
