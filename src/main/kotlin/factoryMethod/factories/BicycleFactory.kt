package factoryMethod.factories

import factoryMethod.vehicle.Bicycle

class BicycleFactory: VehicleFactory() {

    override fun getVehicle(vehicleName: String): Bicycle {
        return Bicycle(vehicleName)
    }
}