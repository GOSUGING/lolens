import kotlinx.coroutines.*

sealed class EstadoViaje(val estados: String){
    object Solicitado : EstadoViaje("El viaje ha sido solicitado")
    object Asignado : EstadoViaje("El viaje ha sido asignado")
    object Viajando : EstadoViaje("Viajando a su destino")
    object Finalizado: EstadoViaje("Ha llegado a su destino")






}