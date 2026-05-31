/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio_10 {
    
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> fila = new LinkedList<>();

        int opcion;

        do {

            System.out.println("\n=== FILA DE ATENCIÓN ===");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre del cliente: ");
                    String cliente = sc.nextLine();

                    fila.add(cliente);

                    break;

                case 2:

                    if (!fila.isEmpty()) {
                        System.out.println("Atendiendo a: " + fila.poll());
                    } else {
                        System.out.println("No hay clientes.");
                    }

                    break;

                case 3:

                    System.out.println("Fila actual:");
                    System.out.println(fila);

                    break;
            }

        } while (opcion != 4);
    }
}

