package org.example;
public class VerificarString {
    public static int contadorLetraA(String vezesA) {
        int count = 0;

        for (char c : vezesA.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}

