/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_3 {

       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();

        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");
        productos.add("Laptop");

        System.out.print("Ingrese producto a buscar: ");
        String buscar = sc.nextLine();

        if (productos.contains(buscar)) {
            System.out.println("Producto encontrado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
 
