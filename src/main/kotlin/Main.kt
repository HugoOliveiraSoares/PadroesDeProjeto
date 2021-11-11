import adapter.validaEmail
import adapter.validation.EmailValidatorAdapter
import factoryMethod.padraoFactory

fun main() {

    println("Escolha um padrão para executar:")
    println("1 - Padrão Factory\n" +
            "2 - Padrão Adapter")
    print(">>> ")

    val opcao = readLine()

    if (opcao == "1")
        padraoFactory()
    else if (opcao == "2"){

        print("Digite um email: ")
        val email = readLine()
        if (email != null)
            validaEmail(EmailValidatorAdapter(), email)
        else
            println("Erro, texto vazio. Digite um email!")

    }else{
        println("Opção inexistente!")
    }

}

