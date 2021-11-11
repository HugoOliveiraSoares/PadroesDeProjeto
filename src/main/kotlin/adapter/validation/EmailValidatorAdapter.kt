package adapter.validation

import org.apache.commons.validator.GenericValidator

class EmailValidatorAdapter: EmailValidatorProtocol {

    override fun isEmail(value: String): Boolean {

        return GenericValidator.isEmail(value)

    }


}