import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val viaje = Viaje(datos = DatosViaje("Sebastián", "Carlos", 2, 3))
println("Bienvenid@ a DIBER")
println("----------------")
    viaje.mostrarDatos()
    viaje.cambioEstado()

}