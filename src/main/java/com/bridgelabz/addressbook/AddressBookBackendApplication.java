package com.bridgelabz.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookBackendApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Addressbook App");
        SpringApplication.run(AddressBookBackendApplication.class, args);
    }
}
