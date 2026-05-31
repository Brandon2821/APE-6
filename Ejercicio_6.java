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

public class Ejercicio_6 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n=== INVENTARIO ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del producto: ");
                    String producto = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    productos.add(producto);
                    cantidades.add(cantidad);

                    break;

                case 2:

                    System.out.println("\nInventario:");

                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println(productos.get(i) + " -> " + cantidades.get(i));
                    }

                    break;
            }

        } while (opcion != 3);
    }
}


