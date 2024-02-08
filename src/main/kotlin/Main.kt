interface EncedidoApagado{
    fun enceder()
    fun apagar()
}

interface DispositivoElectronico{
    fun reiniciar()
}

interface Vehiculo{
    var motorEncendido: Boolean
    var KmHora:Int

    fun acelerar(incrementovelocidad:Int)
    fun frenar(decrementoVelocidad:Int)
}

class Telefono : EncedidoApagado,DispositivoElectronico{
    override fun enceder() {
        println("El telefono se ha encendido")
    }

    override fun apagar() {
        println("El telefono se ha apagado")
    }

    override fun reiniciar() {
        println("El telefono se ha reiniciado")
    }
}

class Lavadora: EncedidoApagado,DispositivoElectronico{
    override fun enceder() {
        println("La lavadora se ha encendido")
    }

    override fun apagar() {
        println("La lavadora se ha apagado")
    }

    override fun reiniciar() {
        println("La lavadora se ha reiniciado")
    }
}

class Coche(override var motorEncendido: Boolean,override var KmHora:Int):EncedidoApagado,Vehiculo{
    override fun enceder() {
        motorEncendido = true
        println("Se ha encendido el coche")
    }

    override fun apagar() {
        motorEncendido = false
        println("Se ha apagado el coche")
    }

    override fun acelerar(incrementovelocidad: Int) {
        if (motorEncendido){
            KmHora += incrementovelocidad
            println("Se ha incrementado la velocidad")
        }else println("El coche esta apagado")
    }

    override fun frenar(decrementoVelocidad: Int) {
        if (motorEncendido){
            KmHora -= decrementoVelocidad
            if (KmHora <= 0 ) println("El coche se ha frenado") else println("Se ha decrementado la velocidad")
        }else println("El coche esta apagado")    }

}

fun main() {
    val telefon1 = Telefono()
    val lavador1 = Lavadora()
    val coch1 = Coche(true,120)
}