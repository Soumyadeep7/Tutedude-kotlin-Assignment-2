package sectionD

interface Playable {
    fun play()
}

class Cricket : Playable {
    override fun play() {
        println("Playing Cricket 🏏")
    }
}

class Football : Playable {
    override fun play() {
        println("Playing Football ⚽")
    }
}

fun main() {
    val games: List<Playable> = listOf(Cricket(), Football())
    games.forEach { it.play() }
}