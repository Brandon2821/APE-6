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

public class Ejercicio_5 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.print("Nombre: ");
            nombres.add(sc.nextLine());

            System.out.print("Nota: ");
            notas.add(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("\nRegistro:");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i) + " -> " + notas.get(i));
        }
    }
}

