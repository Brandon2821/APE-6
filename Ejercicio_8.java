/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
public class Ejercicio_8 {
    
    public static void main(String[] args) {

        String[] arreglo = new String[3];

        arreglo[0] = "A";
        arreglo[1] = "B";
        arreglo[2] = "C";

        System.out.println("Inserción en arreglo:");

        for (String dato : arreglo) {
            System.out.println(dato);
        }

        ArrayList<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        System.out.println("\nInserción en ArrayList:");

        for (String dato : lista) {
            System.out.println(dato);
        }
    }
}

