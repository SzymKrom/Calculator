package org.example;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.depozyt(400);
        System.out.println(bank.depozyt(500));

    }
}