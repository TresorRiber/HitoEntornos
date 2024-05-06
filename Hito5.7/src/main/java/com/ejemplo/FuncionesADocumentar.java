package com.ejemplo;
/**
 *La clase se compone de funciones para observar un array y
 * realizar operaciones con el propio array
 *
 * * @author Carlos, Davi, JeanPierre
 */
public class FuncionesADocumentar {
    public static void main(String[] args) {
        
        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }
    /**
     * El metodo devuelve la suma de todos los valores que se encuentran
     * dentro del array
     *
     * @return  suma Total de valores que se encuentran en el array
     * @param a Array de int
     */

    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }
    /**
     * El metodo devuelve el promedio de todos los valores que se encuentran
     * dentro del array
     *
     * @return  suma(a) / a.length Suma todos los valores que se encuentran dentro del
     * array y los divide entre la longitud del propio array
     * @param a Array de int
     */

    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }
    /**
     * El metodo recorre el array y devuleve el numero mas alto
     *
     * @return  mayor Numero entero mas alto
     *
     * @param a Array de int
     */

    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }
    /**
     * El metodo recorre el array y devuelve el numero mas bajo
     *
     * @return  menor Numero entero mas bajo
     *
     * @param a Array de int
     */

    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }
    /**
     * El metodo devuelve el array de forma inversa al original
     *
     *
     * @param a Array de int
     */

    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    /**
     * El metodo devuelve el array ordenado de mayor a menor
     *
     *
     * @param a Array de int
     */

    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i; j < a.length; j++)
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
