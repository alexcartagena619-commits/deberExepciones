/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chach
 */package modelo;

import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejecutar(sc);
        sc.close();
    }

    public static void ejecutar(Scanner sc) {
        try {
            System.out.print("Ingrese un numero: ");
            int num = Integer.parseInt(sc.nextLine());
            if (num < 0) {
                throw new IllegalArgumentException("El numero no puede ser negativo.");
            }
            System.out.println("Numero ingresado: " + num);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("FINALLY: Este bloque se ejecuta siempre.");
        }
    }
}
