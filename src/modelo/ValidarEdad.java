/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chach
 */package modelo;

import java.util.Scanner;

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejecutar(sc);
        sc.close();
    }

    public static void ejecutar(Scanner sc) {
        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad " + edad + " no es valida (0-120).");
            }
            System.out.println("Edad ingresada: " + edad + " años. Registro exitoso.");
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR PERSONALIZADO: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Debe ingresar un numero entero.");
        }
    }
}
