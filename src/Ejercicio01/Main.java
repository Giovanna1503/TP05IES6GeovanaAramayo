package Ejercicio01;
public class Main {
    public static void main(String[] args) throws Exception {

        String pais = "Argentina";
        int edad = 31;
        double alturaDeUnEdificio = 10.5;
        double precioDeUnProducto = 58.50;
        String telefono = "3885727832";
    
        System.out.println("país: " + pais);
        System.out.println("edad: " + edad);
        System.out.println("altura del edificio: " + alturaDeUnEdificio + " metros");
        System.out.println("precio del producto: " + precioDeUnProducto);
        System.out.println("número de teléfono: " + telefono);
        System.out.println("coseno de 0.5: " + Math.cos(0.5));

        int num1 = 8;
        int num2 = 5;
        int num3 = 1;
        int num4 = 20;
        int num5 = 9;
        
        double promedio = (num1 + num2 + num3 + num4 + num5) / 5.0;

        System.out.println("Números: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
        System.out.println("El promedio es: " + promedio);
    }
}
