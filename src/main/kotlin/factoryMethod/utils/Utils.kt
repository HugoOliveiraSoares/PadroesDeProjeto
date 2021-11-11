package factoryMethod.utils

import factoryMethod.factories.BicycleFactory
import factoryMethod.factories.CarFactory
import factoryMethod.vehicle.Bicycle
import factoryMethod.vehicle.Car
import factoryMethod.vehicle.Vehicle
import java.util.*

fun randomVehicle(): Vehicle {
    val carFactory = CarFactory()
    val car1: Car = carFactory.getVehicle("Fusca")
    val car2: Car = carFactory.getVehicle("Celta")
    val bicycleFactory = BicycleFactory()
    val bicycle: Bicycle = bicycleFactory.getVehicle("Bicicleta")
    val vehicle = arrayOf(car1, car2, bicycle)
    return vehicle[randomNumbers(vehicle.size)]
}

fun randomNumbers(length: Int): Int {
    val random = Random()
    return Math.floor(random.nextDouble() * length).toInt()
}
