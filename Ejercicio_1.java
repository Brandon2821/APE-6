/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
public class Ejercicio_1 {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Juan");
        estudiantes.add("Maria");
        estudiantes.add("Pedro");
        estudiantes.add("Ana");
        estudiantes.add("Luis");

        System.out.println("Lista de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}

