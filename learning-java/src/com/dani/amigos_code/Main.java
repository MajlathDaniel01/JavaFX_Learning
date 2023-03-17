package com.dani.amigos_code;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Passport ukPassport = new Passport ("1234",
                                            "England (UK)",
                                            LocalDate.of(2025,1,25));

        Passport usPassport = new Passport ("123499",
                                            "USA",
                                            LocalDate.of(2030,1,25));

    }

    //Class
    static class Passport {
        //attributes
        String number;
        String country;
        LocalDate expiryDate;
        Passport (String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
