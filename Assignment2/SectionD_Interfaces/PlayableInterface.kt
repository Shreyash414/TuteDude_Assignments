package Assignment2.SectionD_Interfaces

interface Playable {
    fun play()
}

class Cricket : Playable {
    override fun play() {
        println("Playing Cricket with a bat and ball.")
    }
}

class Football : Playable {
    override fun play() {
        println("Playing Football on the field.")
    }
}

fun main() {
    val cricket = Cricket()
    val football = Football()

    cricket.play()
    football.play()
}
