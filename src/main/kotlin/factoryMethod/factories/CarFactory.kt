package factoryMethod.factories

import factoryMethod.vehicle.Car

class CarFactory: VehicleFactory() {

    override fun getVehicle(vehicleName: String): Car {

        return Car(vehicleName)

    }


}