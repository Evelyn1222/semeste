/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto5;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Proyecto5 {
   
     public static void main(String[] args) {
        int C, F;
        Scanner scanner = new Scanner(System.in);
        System.out.print("metro:");
        double metro = scanner.nextDouble();
        double convertir = metro * 3.28084;
        System.out.print(convertir + " ft");
        scanner.close();
    }
}
 
