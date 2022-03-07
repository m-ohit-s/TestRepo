package com.intimetec.moviecall

class RandomMovie {
    private val movies = arrayListOf("Your Name", "Weathering With You", "A Silent Voice", "Anohana", "Garden Of Words", "I want to eat your pancreas")
    public fun generate(): String = movies.random()
}