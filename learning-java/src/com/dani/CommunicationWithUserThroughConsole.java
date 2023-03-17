package com.dani;

import java.time.LocalDate;
import java.util.Scanner;

public class CommunicationWithUserThroughConsole {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
    String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
    int age = scanner.nextInt();

    int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

    }
}
