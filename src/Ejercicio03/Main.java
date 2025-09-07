package Ejercicio03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;      
        int factorial;
        int i; 

        System.out.print("Ingrese un número entero entre 0 y 10: ");
        numero = scanner.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("El número no está en el rango permitido [0,10].");
        } else {
            factorial = 1;
            i = numero;

            while (i > 1) {
                factorial *= i;
                i--;
            }

         System.out.println("El factorial de un numero " + numero + " es: " + factorial);
        }
        scanner.close();

    } 
}