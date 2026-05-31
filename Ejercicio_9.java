/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.LinkedList;
public class Ejercicio_9 {
    
    public static void main(String[] args) {

        LinkedList<String> turnos = new LinkedList<>();

        turnos.add("Cliente 1");
        turnos.add("Cliente 2");
        turnos.add("Cliente 3");

        System.out.println("Turnos actuales:");
        System.out.println(turnos);

        System.out.println("\nAtendiendo a: " + turnos.poll());

        System.out.println("\nTurnos restantes:");
        System.out.println(turnos);
    }
}

