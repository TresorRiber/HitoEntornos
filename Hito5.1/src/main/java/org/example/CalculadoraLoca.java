package org.example;
import java.util.Scanner;
public class CalculadoraLoca { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int num1, num2;
    String operator;

    System.out.print("Introduce el primer número: ");
    num1 = scanner.nextInt();

    System.out.print("Introduce el segundo número: ");
    num2 = scanner.nextInt();

    System.out.print("Introduce el operador (+, -, *, /): ");
    operator = scanner.next();

    double result = calculate(num1, num2, operator);
    System.out.println("Resultado: " + result);

    if (result > 10) {
        System.out.println("El resultado es mayor de 10.");
    } else {
        System.out.println("El resultado es igual o menor de 10.");
    }

    if (result < 0) {
        System.out.println("El resultado es negativo.");
    } else if (result == 0) {
        System.out.println("El resultado es 0.");
    } else {
        System.out.println("El resultado es positivo.");
    }

    scanner.close();
}

    public static double calculate(int num1, int num2, String operator) {

        double result = 0;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                int[][] biderkatzeTaula = new int[10][10];
                int lerroa = 0, zutabea = 0;

                for(int a = 0; a < biderkatzeTaula.length; a++)
                {
                    for(int b = 0; b < biderkatzeTaula[a].length; b++)
                    {
                        biderkatzeTaula[a][b] = lerroa * zutabea;
                        zutabea = zutabea + 1;
                    }
                    lerroa = lerroa + 1;
                    zutabea = 0;
                }

                result = biderkatzeTaula[num1][num2];
                break;
            case "/":
                int zatiketa=0;

                if (num2!=0) {
                    while (num1 >= num2) {
                        num1 -= num2;
                        ++zatiketa;
                    }
                    result = zatiketa;
                }else {
                    System.out.println("No se puede dividir por 0!");
                }

                break;
            default:
                System.out.println("Operador no válido!");
        }

        return result;

    }
}
