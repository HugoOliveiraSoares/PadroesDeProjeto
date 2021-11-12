package templateMethod

import java.io.File

class CustomerDataParserTXT(filePath: String) : CustomerDataParser(filePath) {

    override fun parseData(): List<CustomerData> {
        val rawData = File("src/main/resources/$filePath").bufferedReader()

        val lineList = mutableListOf<String>()
        rawData.useLines { lines -> lines.forEach { lineList.add(it) } }

        val customerData: MutableList<CustomerData> = mutableListOf()

        lineList.forEach { line ->
            val info = line.split('\t')
            customerData.add(CustomerData(info[0], info[1], info[2]))
        }
        return customerData
    }
}