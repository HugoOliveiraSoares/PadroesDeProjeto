package factoryMethod.vehicle

class Car(var name: String): Vehicle {

    override fun pickUp(customerName: String) {
        println("${this.name} está buscando $customerName")
    }

    override fun stop() {
        println("${this.name} parou ")
    }

    override fun toString(): String {
        return "Car(name='$name')"
    }


}