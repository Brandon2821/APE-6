/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
public class Ejercicio_2 {
  
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(7.0);
        notas.add(9.2);
        notas.add(10.0);
        notas.add(6.8);
        notas.add(8.9);

        System.out.println("Notas registradas:");

        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
 

