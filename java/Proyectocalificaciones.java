/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocalificaciones;
import java.util.Scanner; 
/**
 *
 * @author Usuario
 */
public class Proyectocalificaciones {
 
 
    public static void main(String[] args) {
        int c1, c2, c3, c4, c5, c6;
        float promedio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("escribe tu primera calificacion");
        c1 = scanner.nextInt();
        System.out.println("escribe tu segunda calificacion");
        c2 = scanner.nextInt();
        System.out.println("escribe tu tercera calificacion");
        c3 = scanner.nextInt();
        System.out.println("escribe tu cuarta calificacion");
        c4 = scanner.nextInt();
        System.out.println("escribe tu quinta calificacion");
        c5 = scanner.nextInt();
        System.out.println("escribe tu sexta calificacion");
        c6 = scanner.nextInt();
        promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
        System.out.println("Tu promedio es:" + promedio);
    }
}
     
 