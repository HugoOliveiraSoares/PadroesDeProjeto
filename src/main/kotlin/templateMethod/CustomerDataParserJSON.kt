package templateMethod

import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.FileReader

class CustomerDataParserJSON(filePath: String) : CustomerDataParser(filePath) {

    override fun parseData(): List<CustomerData> {

        val rawData = FileReader("src/main/resources/$filePath")

        val jsonParser = JSONParser()
        val jsonObject: JSONArray = jsonParser.parse(rawData) as JSONArray

        val customerData: MutableList<CustomerData> = mutableListOf()

        val list: List<JSONObject> = jsonObject.toList() as List<JSONObject>

        list.forEach { customer ->
            val name = customer["name"] as String
            val age = customer["age"] as String
            val cpf = customer["cpf"] as String
            customerData.add(CustomerData(name, age, cpf))
        }

        return customerData

    }

}