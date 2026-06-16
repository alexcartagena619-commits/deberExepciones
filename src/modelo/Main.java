/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chach
 */package modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== DEBER: MANEJO DE EXCEPCIONES EN JAVA ===\n");
        System.out.println("========== EJERCICIO 1 ==========");
        ValidarEdad.ejecutar(sc);
        System.out.println("\n========== EJERCICIO 2 ==========");
        ValidarNumero.ejecutar(sc);
        System.out.println("\n=== FIN DE LOS EJERCICIOS ===");
        sc.close();
    }
}
