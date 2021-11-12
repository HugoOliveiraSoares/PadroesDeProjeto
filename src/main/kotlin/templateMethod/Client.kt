package templateMethod

fun templatMethod() {

    val customerDataParserTXT = CustomerDataParserTXT("customer.txt")

    customerDataParserTXT.fixCustomerData()

    println(customerDataParserTXT.customerData)

    val customerDataParserJSON = CustomerDataParserJSON("customer.json")

    customerDataParserJSON.fixCustomerData()

    println(customerDataParserJSON.customerData)


}