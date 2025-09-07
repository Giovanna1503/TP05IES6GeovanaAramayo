package Ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            int triple = numero * 3;
            System.out.println("El número es par. El triple es: " + triple);
        } else {
            int doble = numero * 2;
            System.out.println("El número es impar. El doble es: " + doble);
        }
        scanner.close();
    }
}
