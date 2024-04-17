package org.example;
import java.util.Scanner;
public class CalculadoraLoca { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double num1, num2;
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

}

    public static double calculate(double num1, double num2, String operator) {

        double result = 0;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":

                result = num1*num2;
                break;
            case "/":
                if (num2!=0){
                    result=num1/num2;
                }else {
                    System.out.println("División por cero no permitida");
                }
                break;
            default:
                System.out.println("Operador no válido!");
        }

        return result;

    }
}
