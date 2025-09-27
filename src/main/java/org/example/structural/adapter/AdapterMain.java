package org.example.structural.adapter;

import org.example.structural.adapter.validation.EmailValidatorAdapter;
import org.example.structural.adapter.validation.EmailValidatorProtocol;

public class AdapterMain {

    public static void main(String[] args) {
        String email = "danilo.lima.techgmail.com";

        EmailValidatorProtocol valid = new EmailValidatorAdapter();
        boolean isValid = valid.isEmail(email);

        System.out.println(isValid);
    }
}
