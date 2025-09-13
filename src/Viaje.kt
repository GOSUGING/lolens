import kotlinx.coroutines.delay

class Viaje(val datos: DatosViaje) {

    val tarifaNormal = 2500
    val tarifaPremium = 3500

    var estado: EstadoViaje = EstadoViaje.Solicitado

    fun calcularTarifa(): Double {
        val tarifaBase = if(datos.tipoViaje == 1) tarifaNormal else tarifaPremium
        val subtotal = tarifaBase * datos.comunas
        return subtotal * 1.19
    }

    fun mostrarDatos() {
        println("DATOS VIAJE")
        println("Pasajero: ${datos.pasajero} ")
        println("Conductor: ${datos.conductor}")
        val tipoDeViaje = if (datos.tipoViaje == 1) "Tarifa Normal" else "Tarifa Premium"
        println("Tipo de viaje: $tipoDeViaje")
        println("Comunas recorridas: ${datos.comunas}")

        println("Total viaje: ${calcularTarifa()}")

    }

    suspend fun cambioEstado() {
        cambiarEstado(EstadoViaje.Solicitado)
        delay(2000L)
        cambiarEstado(EstadoViaje.Asignado)
        delay(2000L)
        cambiarEstado(EstadoViaje.Viajando)
        delay(2000L)
        cambiarEstado(EstadoViaje.Finalizado)
    }

    fun cambiarEstado(nuevo: EstadoViaje) {
        estado = nuevo
        println("Estado actual: ${estado.estados}")
    }


}