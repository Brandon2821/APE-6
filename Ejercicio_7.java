/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
public class Ejercicio_7 {
   public static void main(String[] args) {

        String[] arreglo = {"Juan", "Ana", "Pedro"};

        System.out.println("ARREGLO");

        for (String nombre : arreglo) {
            System.out.println(nombre);
        }

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Juan");
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Maria");

        System.out.println("\nARRAYLIST");

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        System.out.println("\nTamaño arreglo: " + arreglo.length);
        System.out.println("Tamaño ArrayList: " + lista.size());
    }
}
 

