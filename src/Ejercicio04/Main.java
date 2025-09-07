package Ejercicio04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número entero entre 1 y 9: ");
        numero = scanner.nextInt();

        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado no está en el rango [1,9].");
        } else {
            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
        scanner.close();
    }
}
    
