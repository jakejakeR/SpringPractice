package com.spring.springpractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class SpringPracticeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printMenu();
        var scanner = new Scanner(new InputStreamReader(System.in));
        System.out.print("Your choice (number or \"exit\"): ");
        String userInput = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("User input works: " + userInput);
    }

    private void printMenu() {
        System.out.println("Provide a command to execute");
        System.out.println("1. Show all the beans");
        System.out.println("2. Say hello");
        System.out.println("exit\n");
    }
}
