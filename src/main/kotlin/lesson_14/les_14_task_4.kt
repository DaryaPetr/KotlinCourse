package lesson_14

abstract class HeavenlyBody() {

    abstract val name: String
    abstract val isHaveAtmosphere: Boolean
    abstract val isSuitableForLanding: Boolean

}

class Planet(
    override val name: String,
    override val isHaveAtmosphere: Boolean = false,
    override val isSuitableForLanding: Boolean = false,
    val satellites: MutableList<Satellite> = mutableListOf()
) : HeavenlyBody() {

    fun printPlanetName() = println("Planet: $name")

    fun printSatellites() {
        print("Satellites: ")
        satellites.forEach {
            print(it.name)
            if (it != satellites.last()) print(", ")
        }
        println()
    }
}

class Satellite(
    override val name: String,
    override val isHaveAtmosphere: Boolean = false,
    override val isSuitableForLanding: Boolean = false,
) : HeavenlyBody()

fun main() {

    val jupiter = Planet("Jupiter")
    val callisto = Satellite("Callisto")
    val io = Satellite("Io")
    jupiter.satellites.add(callisto)
    jupiter.satellites.add(io)
    jupiter.printPlanetName()
    jupiter.printSatellites()

}