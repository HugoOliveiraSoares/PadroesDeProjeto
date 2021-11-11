package adapter

import adapter.validation.EmailValidatorAdapter
import adapter.validation.EmailValidatorProtocol


fun validaEmail(emailValidator: EmailValidatorProtocol, email: String) {

    if(emailValidator.isEmail(email))
        println("Email é válido")
    else
        println("Email é invalido")
}

fun main() {



}