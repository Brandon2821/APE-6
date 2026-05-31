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


public class Ejercicio_4 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    lista.add(sc.nextLine());
                    break;

                case 2:
                    System.out.println(lista);
                    break;

                case 3:
                    System.out.print("Posicion: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nuevo valor: ");
                    String nuevo = sc.nextLine();

                    lista.set(pos, nuevo);
                    break;

                case 4:
                    System.out.print("Posicion: ");
                    int eliminar = sc.nextInt();
                    lista.remove(eliminar);
                    break;
            }
        } while (opcion != 5);
    }
}


