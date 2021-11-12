package templateMethod

abstract class CustomerDataParser(val filePath: String) {

    lateinit var customerData: List<CustomerData>

    fun fixCustomerData() {
        this.customerData = this.parseData()
        this.customerData = this.fixCPF()
    }

    private fun fixCPF(): List<CustomerData> {
        this.customerData.forEach { customer ->
            customer.cpf = customer.cpf.replace(Regex("[-,.]"), "")
        }

        return this.customerData
    }

    protected abstract fun parseData(): List<CustomerData>

}