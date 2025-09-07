package Ejercicio05.main;

import java.time.LocalDate;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        // La construcción de un objeto perteneciente a la clase Persona utilizando el constructor por defecto.

        Persona persona1 = new Persona();
        persona1.setDni("35079984");
        persona1.setNombre("Paola Cardozo");
        persona1.setFechaDeNacimiento(LocalDate.of(1990, 3, 15));
        persona1.setProvincia("Salta");
        persona1.mostrarDatos();

        // La construcción de un objeto perteneciente a la clase Persona utilizando el constructor parametrizado.
        Persona persona2 = new Persona("38163051", "Geovana Aramayo", LocalDate.of(1994, 3, 15), "Tucuman");
        persona2.mostrarDatos();

        // // La construcción de un objeto perteneciente a la clase Persona utilizando el constructor que lleva como parámetros el dni, nombre y fecha de nacimiento.

        Persona persona3 = new Persona("53210986", "Carina Peralta ", LocalDate.of(2010, 10, 13));
        persona3.mostrarDatos();
    }


}



