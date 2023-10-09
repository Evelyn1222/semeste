/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto4;
import java.util.Scanner;  
/**
 *
 * @author Usuario
 */
public class Proyecto4 {
 

    public static void main(String[] args) {
         int C, F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el valor en grados celsius");
        C = Integer.parseInt(scanner.nextLine());
        F = C * 9 / 5 + 32;
        System.out.println("Mostrar el resultado en fahrenheit:" + F);
    }
}