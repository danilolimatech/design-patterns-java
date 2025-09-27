package org.example.structural.adapter.validation;

import org.apache.commons.validator.routines.EmailValidator;

public class EmailValidatorAdapter implements EmailValidatorProtocol {

    public boolean isEmail(String value) {
        return EmailValidator.getInstance().isValid(value); // Validation using the library
    }
}
