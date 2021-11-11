package adapter.validation

interface EmailValidatorProtocol {

    fun isEmail(value: String): Boolean

}