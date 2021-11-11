package factoryMethod.factories

import factoryMethod.vehicle.Vehicle

abstract class VehicleFactory {

    abstract fun getVehicle(vehicleName: String): Vehicle

    fun pickUp(customerName: String, vehicleName: String): Vehicle{
        val vehicle: Vehicle = this.getVehicle(vehicleName)
        vehicle.pickUp(customerName);
        return vehicle
    }

}