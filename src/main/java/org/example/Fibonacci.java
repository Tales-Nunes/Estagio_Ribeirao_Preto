package org.example;

public class Fibonacci {

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        int anterior = 0;
        int atual = 1;
        while (atual < number) {
            int next = anterior + atual;
            anterior = atual;
            atual = next;
        }

        return atual == number;
    }
}

