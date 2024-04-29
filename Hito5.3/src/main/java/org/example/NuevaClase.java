package org.example;

public class NuevaClase {
    // Método que suma dos números enteros y devuelve el resultado
    public int sum(int a, int b) {
        return a + b;
    }

    // Método que concatena dos cadenas y devuelve el resultado
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Método que verifica si un número es par
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Método que devuelve el máximo de tres números
    public int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Método que devuelve el factorial de un número
    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
