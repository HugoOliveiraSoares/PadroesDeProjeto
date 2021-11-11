package factoryMethod

import factoryMethod.factories.CarFactory
import factoryMethod.utils.randomNumbers
import factoryMethod.utils.randomVehicle
import factoryMethod.vehicle.Vehicle

fun padraoFactory() {

    val carFactory = CarFactory()
    val names = arrayOf("Ana", "Joana", "Helena", "João")

    for (i in 0..9) {
        val vehicle: Vehicle = randomVehicle()
        val name = names[randomNumbers(names.size)]
        vehicle.pickUp(name)
        vehicle.stop()
        val novoCarro: Vehicle = carFactory.pickUp(name, "Novo carro - " + randomNumbers(100))
        novoCarro.stop()
        println("------")
    }

}