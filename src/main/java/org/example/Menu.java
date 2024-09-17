package org.example;

import java.util.Scanner;

import static org.example.Fibonacci.isFibonacci;
import static org.example.VerificarString.contadorLetraA;

public class Menu {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Exibe o menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Verificar Fibonacci");
            System.out.println("2. Verificar existência de 'a' em uma string");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            switch (option) {
                case 1:
                    // Fibonacci
                    System.out.print("Informe um número: ");
                    int number = scanner.nextInt();
                    if (isFibonacci(number)) {
                        System.out.println(number + " pertence à sequência de Fibonacci.");
                    } else {
                        System.out.println(number + " não pertence à sequência de Fibonacci.");
                    }
                    break;

                case 2:
                    // Verificar string
                    System.out.print("Informe uma string: ");
                    String input = scanner.nextLine();
                    int count = contadorLetraA(input);
                    if (count > 0) {
                        System.out.println("A letra 'a' aparece " + count + " vezes.");
                    } else {
                        System.out.println("A letra 'a' não aparece na string.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        // Fecha o scanner
        scanner.close();
    }
}
